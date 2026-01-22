package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={5,7,0,9,1};
		
		List<Integer> lst = new ArrayList<>();
		for(int a:arr)
			lst.add(a);
		Collections.sort(lst);
		Collections.reverse(lst);
		System.out.println(lst);

	}

}
