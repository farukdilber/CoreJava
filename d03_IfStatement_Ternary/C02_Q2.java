package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C02_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Plus for 1\nMinus for 2\nMultiplication for 3\nDivide for 4 \nPlease choose your process : ");
		int pick = scan.nextInt();
		System.out.println("Enter two numbers");
		
		double num1 =scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(pick==1) {
			System.out.println("Plus result : " + num1+"+"+num2+"="+(num1+num2));
		}else if (pick==2) {
			System.out.println("Minus result : " + num1+"-"+num2+"="+(num1-num2));
			
		}else if (pick==3) {
			System.out.println("Multiplication result : " + num1+"x"+num2+"="+(num1*num2));
		}else if (pick==4) {
			System.out.println("Divide result : " + num1+"/"+num2+"="+(num1/num2));
		}else {
			System.out.println("Try Again");
		}
		
		scan.close();

	}

}
