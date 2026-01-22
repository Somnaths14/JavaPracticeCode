package practice;

import java.util.ArrayList;
import java.util.List;

public class Jan18thPraactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		String newS = null;
		// a,ab,ac,b,bc,c,abc - its should be out put
		List<String> ls = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			ls.add(""+s.charAt(i));
			for(int j=i+1;j<s.length();j++)
				
			{
				
				ls.add(""+s.charAt(i)+s.charAt(j));
			}

		}
		ls.add(s);
		
		System.out.println(ls);

	}

}
