package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapwithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr = {'A','B','C','B','A'};
		
		Map<Character,List<Integer>> mp = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!mp.containsKey(arr[i]))
			{
				mp.put(arr[i], new ArrayList<Integer>());
				
			}
			mp.get(arr[i]).add(i);
			
			
		}
		System.out.println(mp);

	}

}
