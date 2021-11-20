package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C01_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("UNIVERSITY SYSTEM\n");

		System.out.print("Midterm 1 : ");
		double midT = sc.nextDouble();

		System.out.print("Midterm percentage: ");
		double midT_percent = sc.nextDouble();

		System.out.print("Final  : ");
		double fin = sc.nextDouble();

		System.out.print("Final percentage: ");
		double fin_percent = sc.nextDouble();

		System.out.println("*************************************");

		double ort = midT * (midT_percent / 100) + fin * (fin_percent / 100);

		System.out.println("Average : " + ort);
		System.out.print("Average with char : ");

		if (ort >= 90) {
			System.out.println("AA ...");
		} else if (ort >= 80) {
			System.out.println("BA ...");
		} else if (ort >= 70) {
			System.out.println("BB ...");
		} else if (ort >= 60) {
			System.out.println("CB ...");
		} else if (ort >= 50) {
			System.out.println("CC ...");

		} else if (ort >= 40) {
			System.out.println("DC ...");
		} else if (ort >= 30) {
			System.out.println("DD ...");

		} else {
			System.out.println("FF ...");

		}
		sc.close();
	}

}
