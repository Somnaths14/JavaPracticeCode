package practice;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s ="java";
        String s2 ="java";
        String s1 = new String("java");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        
        System.out.println(s==s1);
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Test");

        System.out.println(sb);
        String str = "Java";
        

        System.out.println(sb);
	}

}
