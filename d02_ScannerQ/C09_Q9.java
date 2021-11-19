package d02_ScannerQ;

import java.util.Scanner;

public class C09_Q9 {

	public static void main(String[] args) {
		/* OUTPUT
        a number: 5
        b number: 3
        c number: 1
        result : 5.333333333333333
        */
		 Scanner scan = new Scanner(System.in);

	        double a;
	        double b;
	        double c;

	        System.out.print("a: ");
	        a = scan.nextDouble();

	        System.out.print("b: ");
	        b = scan.nextDouble();

	        System.out.print("c: ");
	        c = scan.nextDouble();

	        double result = ((a * a) - (b * b)) / (3 * c);
	        System.out.println("Result : " + result);
	        scan.close();
	}

}
