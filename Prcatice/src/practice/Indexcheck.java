package practice;

public class Indexcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 8, 8, 0 };
		int num = 8;
		int frst = 0;
		int last = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				frst = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == num) {
						last = j;

					}
					else break;
				}
			}
		}
		
		System.out.println(frst +" -"+last);
	}

}
