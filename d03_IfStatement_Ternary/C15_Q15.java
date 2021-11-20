package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C15_Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entre three numbers!");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " Biggest number");

		} else if (num2 >= num3 && num2 >= num1) {
			System.out.println(num2 + " Biggest number");
		} else if (num3 >= num1 && num3 >= 2) {
			System.out.println(num3 + " Biggest number");
		}
		if (num2 >= num1 && num3 >= num1) {

			System.out.println(num1 + " Smallest number");
		} else if (num1 >= num2 & num3 >= num2) {
			System.out.println(num2 + " smallest number");
		} else if (num1 >= num3 && num2 >= num3) {
			System.out.println(num3 + " smallest number");
		}
		scan.close();
	}
}
