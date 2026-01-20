package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRiverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,6,0,9};
		
		List<Integer> l = new ArrayList<>();
		
		for(int i:arr)
		{
			l.add(i);
		}
		
		Collections.reverse(l);
		
		System.out.println(l);
		

		
	}

}
