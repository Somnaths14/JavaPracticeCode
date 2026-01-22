package practice;

import java.util.ArrayList;
import java.util.List;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] arr = {"Name1" , "Name2","Name3","Name4"};
       String[] search = {"Name1" , "Name2", "Name6","Name7"};
       
		//print all names of search array are present in given array
       //if not present print that name
       
       List<String> aL = new ArrayList<>();
       for(String s:arr)
       {
    	   aL.add(s);
       }
       int count=0;
       List<String> notPresent = new ArrayList<>();
       for(int i=0;i<search.length;i++)
       {
    	     if(aL.contains(search[i]))
    	     {   count++;
    	    	    System.out.println(search[i]);
    	     }
    	     else
    	    	 {
    	    	 System.out.println("Not Present");
    	    	 notPresent.add(search[i]);
    	    	 System.out.println(search[i]);
    	    	 }
       }
	       
	      
//	      System.out.println("All element Present -");
//	    	      for(String s1:search)
//	    	    	    System.out.println(s1);
//	       
//	       System.out.println("Not Present - " + notPresent );
			
		
	}

}
