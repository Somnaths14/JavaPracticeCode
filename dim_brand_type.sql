{{
  config(
    materialized='incremental',
    unique_key=['brand_type_code'],
    merge_exclude_columns = ['ingest_timestamp']
  )
}}
with default_rows as (
    select * from {{ ref('stg_default_brand_type') }}
),

extracted_brand_type as (
    select * from {{ ref('stg_brand_type') }}
),

computed_brand_type as (
    select
        price_band_code as brand_type_code,
        price_band_category_text_en as brand_type_name,
        case
            when price_band_code = 'D1' then 'DELHAIZE'
            when price_band_code = 'N1' then 'NATIONAL'
            when price_band_code = 'Z0' then 'NO BRAND'
            else 'OTHER'
        end as brand_type_description
    from extracted_brand_type
),

final_brand_type as (
    select
        {{ generate_bigint_sk(['brand_type_code']) }} as `DimBrandTypeSK`,
        brand_type_code,
        brand_type_name,
        brand_type_description
    from computed_brand_type
    {% if not is_incremental() %}
        union all
        select
            cast(`DimBrandTypeSK` as bigint) as `DimBrandTypeSK`,
            brand_type_code,
            brand_type_name,
            brand_type_description
        from default_rows
    {% endif %}

)

select
    `DimBrandTypeSK`,
    brand_type_code,
    brand_type_name,
    brand_type_description,
    current_timestamp() as ingest_timestamp,
    current_timestamp() as modified_timestamp
from final_brand_type
