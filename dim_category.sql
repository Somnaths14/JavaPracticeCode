{{
  config(
    materialized='incremental',
    unique_key=['category_number'],
    merge_exclude_columns = ['ingest_timestamp']
  )
}}
with final_category as (
    select
        category_number,
        category_name,
        sm_department_number,
        sm_department_name,
        sm_superdepartment_number,
        sm_superdepartment_name,
        ad_department_number,
        ad_department_name,
        ad_superdepartment_number,
        ad_superdepartment_name,
        sm_department_number_and_name,
        ad_department_number_and_name,
        sm_superdepartment_number_and_name,
        ad_superdepartment_number_and_name,
        {{ generate_bigint_sk(['category_number']) }} as `DimCategorySk`
    from {{ ref('stg_category') }}

    {% if not is_incremental() %}
        union all
        select
            category_number,
            category_name,
            sm_department_number,
            sm_department_name,
            sm_superdepartment_number,
            sm_superdepartment_name,
            ad_department_number,
            ad_department_name,
            ad_superdepartment_number,
            ad_superdepartment_name,
            sm_department_number_and_name,
            ad_department_number_and_name,
            sm_superdepartment_number_and_name,
            ad_superdepartment_number_and_name,
            `DimCategorySk`
        from {{ ref('stg_default_category') }}
    {% endif %}
)

select
    `DimCategorySk`,
    cast(category_number as int) as category_number,
    category_name,
    cast(sm_department_number as int) as sm_department_number,
    sm_department_name,
    cast(sm_superdepartment_number as int) as sm_superdepartment_number,
    sm_superdepartment_name,
    cast(ad_department_number as int) as ad_department_number,
    ad_department_name,
    cast(ad_superdepartment_number as int) as ad_superdepartment_number,
    ad_superdepartment_name,
    sm_department_number_and_name,
    ad_department_number_and_name,
    sm_superdepartment_number_and_name,
    ad_superdepartment_number_and_name,
    current_timestamp() as ingest_timestamp,
    current_timestamp() as modified_timestamp
from final_category
