package d02_ScannerQ;

import java.util.Scanner;

public class C10_Q10 {

	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius
		// degree.
		// Formula c = (f-32)*5/9

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Fahreneit degrees  : ");

		int f = scan.nextInt();
		System.out.println("Celsius : " + (f - 32) * 5 / 9);
		scan.close();
	}

}
