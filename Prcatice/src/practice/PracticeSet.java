package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-20,5,6,5,9,7,9,0,7};
		 Set<Integer> set = new LinkedHashSet<>();
		    for (int i : arr) 
		    	set.add(i);
		    System.out.println(set);
	}

}
