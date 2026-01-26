package practice;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s="somnathsaha";
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int i=0;i<s.length();i++ )
		{
			if(mp.containsKey(s.charAt(i)))
				mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
			else 
				mp.put(s.charAt(i), 1);
			
		}
		
		for(java.util.Map.Entry<Character, Integer> entry: mp.entrySet())
		{
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
		
		System.out.println(mp);
		
	}

}
