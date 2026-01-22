package practice;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "aaahhb";
        int count = 0;
        int start =0,end =0;
        List<Character> lst = new ArrayList<>();
        
        	for (int i = 0; i < str.length(); i++) {

        	    start = i;
        	    count = 1;   // reset count for each new character

        	    for (int j = i + 1; j < str.length(); j++) {

        	        if (str.charAt(i) == str.charAt(j)) {
        	            count++;
        	            i++;   // skip already counted characters
        	        } else {
        	            break;
        	        }
        	    }

        	    System.out.print(str.charAt(start) + "" + count);
        	   //i=count;
        	   
        }
	}

}
