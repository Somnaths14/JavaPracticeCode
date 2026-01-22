package practice;

public class Zeroremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc =250006000;
		
		int rem =0;
		while(abc>0)
		{
			rem=abc%10;
			if(rem!=0)
				break;
			abc =abc/10;
				
		}
		System.out.println(abc);

	}

}
