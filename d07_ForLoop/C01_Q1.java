package d07_ForLoop;

public class C01_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int total=0;   
		for (int i = 100; i > 0; i--) {
			if (i%13==0) {
				System.out.println(i);
				total+=i;
			}
		}
		System.out.println(total);
	}

}
