package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C08_Q8 {

	public static void main(String[] args) {
		/*
		 * Capital char check
		 */
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please write a char ");
		
		char ch = sc.next().charAt(0);
		
		if (ch >= 'a' && ch<='z') {
			
		System.out.println("Lower case");
			
		}else if (ch>='A' && ch<='Z') {
			System.out.println("Upper case");
		}else {
			System.out.println("Try Again!");
		}
		
		
		sc.close();

	}

}
