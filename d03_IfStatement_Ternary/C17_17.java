package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C17_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		System.out.println("*****  TERNARY   *****");

		String result = (num >= 0) ? (num < 10 ? "number" : "Positive") : ("Negative");
		System.out.println(result);
		scan.close();
	}

}
