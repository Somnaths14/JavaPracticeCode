package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 9, 6 ,6,2};//9657
		// List<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 9, 6));
		int rotate = 3;
		List<Integer> result =calculation(arr,rotate);
		System.out.println(result);
		
	}

	
	public static List<Integer> calculation(int[] array,int index)
	{
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < (array.length) - index; i++) {
			list1.add(array[i]);
		}
		
		for (int i = (array.length) - index; i < array.length; i++) {
             list2.add(array[i]);
		}
		list2.addAll(list1);
		return list2;
	}
}
