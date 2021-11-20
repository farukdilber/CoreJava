package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C13_13 {

	public static void main(String[] args) {
//		Triangle Check  
		Scanner scanner = new Scanner(System.in);

	        int a;
	        int b;
	        int c;

	        System.out.print("Birinci sayýyý giriniz: ");
	        a = scanner.nextInt();

	        System.out.print("Ýkinci sayýyý giriniz: ");
	        b = scanner.nextInt();

	        System.out.print("Üçüncü sayýyý giriniz: ");
	        c = scanner.nextInt();

	        if ((a * a) + (b * b) == c * c) {
	            System.out.println("Bu bir dik üçgendir.");
	        } else if ((a * a) + (c * c) == b * b) {
	            System.out.println("Bu bir dik üçgendir.");
	        } else if ((b * b) + (c * c) == a * a) {
	            System.out.println("Bu bir dik üçgendir.");
	        } else {
	            System.out.println("Bu üçgen bir dik üçgen deðildir.");
	        }

scanner.close();
	}

}
