package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C19_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number  : ");
		int num = scan.nextInt();

		System.out.println("*****  TERNARY çözümü  *****");

		String result = (num > 99 && num < 1000) ? ("3 digit")
				: (num % 2 == 0 ? "3 digit even number" : "3 digit odd number");
		System.out.println(result);
		scan.close();
	}

}
