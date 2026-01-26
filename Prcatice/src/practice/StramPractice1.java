package practice;

import java.util.HashMap;
import java.util.Map;

public class StramPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 3);
		map.put("banana", 1);
		map.put("orange", 2);
		
		//sort by key 
		map.entrySet()
		.stream().sorted(Map.Entry.comparingByValue()).forEach(n->System.out.println(n.getKey()+"-"+n.getValue()));

	}

}
