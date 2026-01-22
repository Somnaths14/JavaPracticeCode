package practice;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n =123;
        int newNum =0;
        int rem=0;
        while(n>0) {
        	rem=n%10;
        	
        	newNum =(newNum*10)+rem;
        	n=n/10;
        	
        }
        System.out.println(newNum);
	}

}
