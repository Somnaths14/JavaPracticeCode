package practice;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(2,5,1,8,3,0);
		
		System.out.println(nums.stream()
			.filter(n->n%2==0)
			.sorted()
			.reduce(0,(c,e)->c+e));
			//.forEach(n->System.out.println(n));

	}

}
