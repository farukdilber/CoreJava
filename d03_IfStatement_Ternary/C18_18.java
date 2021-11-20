package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C18_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a character  : ");
		char ch = scan.next().charAt(0);

		System.out.println("*****  TERNARY   *****");

		String result = ((ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z'))
				? ((ch <= 122 && ch >= 97) ? "Lower case" : "Upper case")
				: "Not a char";

		System.out.println(result);
		scan.close();
	}

}
