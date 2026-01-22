package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={5,7,0,9,1};
		
		Set<Integer> st = new HashSet<>();
		
		for(int a:arr)
			st.add(a);
		Set<Integer> ts = new TreeSet<>(st);
		System.out.println(ts);
		
	}

}
