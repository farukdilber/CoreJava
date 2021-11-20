package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C03_Q3 {

	public static void main(String[] args) {
		/*
		 * Make triangle method
		 * 
		 * 
		 * a+b>c>a-b a+c>b>a-c b+c>a>b-c a=b=c
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a three integer numbers");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
			if (a == b && a == c) {
				System.out.println("Triangle also equilateral triangle");
			} else {
				System.out.println("Triangle but not equilateral triangle");
			}
		} else {
			System.out.println("Not a Triangle.");
		}
	input.close();
	}

}
