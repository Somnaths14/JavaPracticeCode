package practice;

public class NumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =56945;
		int n =5;
		int count =0;
		while(num>0)
		{
			if(num%10 == n)
				count++;
			num /=10;
		}
		
   System.out.println(count);
	}

}
