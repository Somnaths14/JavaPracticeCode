package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a ="madam";
        String b="mdmaa";
        
        List<Character> aL = new ArrayList<>();
        List<Character> bL = new ArrayList<>();
        
        
        if(a.length()==b.length())
        {
        	  for(int i=0;i<a.length();i++)
        		  
        	  {
        		  aL.add(a.charAt(i));
        		  bL.add(b.charAt(i));
        	  }
        	  Collections.sort(aL);
        	  Collections.sort(bL);
        	  if(aL.equals(bL))
             	 System.out.println("Anagram");
        	  else System.out.println("Not Anagram");
        }
        else System.out.println("Not Anagram");
       
        
		
	}

}
