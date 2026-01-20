package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,80,90,20,40,60,20};
		
		Set<Integer> st = new HashSet<>();
		
		for(int arrElement: arr)
		{
			st.add(arrElement);
		}
		System.out.println(st);
		Set<Integer> sortedSet = new TreeSet<>(st);
		System.out.println(sortedSet);
	}

}
