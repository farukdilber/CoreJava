package d02_ScannerQ;

import java.util.Scanner;

public class C05_Q5 {

	public static void main(String[] args) {
		/*
		 * 
		 * First edge: 12 Second edge: 5 Hypotenuse: 13
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("First Edge : ");
		int a = scanner.nextInt();

		System.out.print("Second Edge: ");
		int b = scanner.nextInt();

		double h = Math.sqrt((a * a) + (b * b));
		System.out.println("Hypotenuse: " + h);
		scanner.close();
	}

}
