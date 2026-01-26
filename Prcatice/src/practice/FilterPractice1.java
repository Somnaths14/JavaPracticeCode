package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fetch only names starts with A
		List<String> names = List.of("Alex", "Bob", "Andrew", "Charlie");
		names.stream().filter(str -> str.startsWith("A")).forEach(str -> System.out.println(str));

		// Filter null values
		List<String> data = Arrays.asList("Java", null, "Python", null, "Go");

		data.stream().filter(d -> d != null).forEach(str -> System.out.println(str));

		// Numbers greater than 10 and divisible by 3
		List<Integer> nums = List.of(3, 6, 9, 12, 15, 20);

		nums.stream().filter(n -> n > 10 && n % 3 == 0).forEach(str -> System.out.println(str));

		// Strings with length > 4 and uppercase them
		List<String> langs = List.of("java", "spring", "api", "docker");
		langs.stream().filter(str -> str.length() > 4).map(str -> str.toUpperCase())
				.forEach(str -> System.out.println(str));
		
		//Find all duplicate numbers
		List<Integer> nums1 = List.of(1, 2, 3, 2, 4, 1, 5);
		nums1.stream().filter(n -> Collections.frequency(nums1, n)>1).distinct().forEach(n-> System.out.println(n));
		
		
		//Ignore blanks and filter valid emails
		List<String> emails = Arrays.asList(
				"admin@test.com", "", " ", null, "user@gmail.com"
				);
		emails.stream()
		.filter(e -> e != null) 
		.filter(e -> e.length() > 1) 
		.filter(e -> e.contains("@"))
		.forEach(System.out::println);

		
		//Find first number greater than 50
		List<Integer> nums2 = List.of(10, 25, 60, 70, 40);
		System.out.println(nums2.stream().filter(n -> n>50).findFirst());
		
		//filter > 60
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 45);
		scores.put("Charlie", 70);
		scores.put("David", 30);
		
		//scores.entrySet().stream().filter(n -> n.getValue()>60).forEach(n -> System.out.println(n.getKey()));
		
		scores.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(n -> System.out.println(n));
		
		
		
		List<Integer> nums420 = List.of(10, 25, 60, 70, 40,10,70);
		
		nums420.stream().filter(n -> Collections.frequency(nums420, n)==1).distinct().forEach(n -> System.out.println(n));
	}

}
