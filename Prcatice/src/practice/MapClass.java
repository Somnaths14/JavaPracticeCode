package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,95,6,5,8,10,95};
		
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else 
				mp.put(arr[i],1);
		}
		
		System.out.println(mp);
		
		for(Entry<Integer, Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
	}

}
