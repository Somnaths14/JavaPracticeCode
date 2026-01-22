package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZeroRemovalinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {5,8,2,0,50,0};
        int index =-1;
        for(int i=arr.length-1;i>=0;i--)
        {
        	  if(arr[i]!=0)
        	  {
        		  index =i;
        		  break;
        	  }
        }
        
        for(int i=0;i<=index;i++)
        	System.out.print(arr[i]+" ");
	}

}
