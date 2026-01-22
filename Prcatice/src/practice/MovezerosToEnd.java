package practice;

import java.util.ArrayList;
import java.util.List;

public class MovezerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,4,8,0,5,0,9};
		List<Integer> lst = new ArrayList<>();
		int zerocount=0;
		for(int a: arr)
		{
			if(a!=0)
				lst.add(a);
			else
				zerocount++;
		}
		for(int i=0;i<zerocount;i++)
			lst.add(0);
		
		System.out.println(lst);
		

	}

}
