package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 8, 7, 2, 0, 6, 8, 5, 5, 5 };
		Map<Integer, Integer> l = new HashMap<>();

		for (int i : a) {
			if (l.containsKey(i)) {
				l.put(i, l.get(i) + 1);
			} else
				l.put(i, 1);
		}
		System.out.println(l);
		

	}

}
