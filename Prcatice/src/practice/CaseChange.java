package practice;

public class CaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="StRinG";
		//StringBuilder sb = new StringBuilder();
		
		String newS ="";
		
		for(int i=0;i<s.length();i++)
		{
			//char cas = s.charAt(i);
			if(Character.isLowerCase(s.charAt(i)))
			{
				//char n =Character.toUpperCase(s.charAt(i));
				newS =newS + Character.toUpperCase(s.charAt(i));
			}
			else
				newS =newS + Character.toLowerCase(s.charAt(i));
		}
		
		System.out.println(newS);
		
		
		
	}

}
