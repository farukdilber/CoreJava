package d02_ScannerQ;

import java.util.Scanner;

public class C11_Q11 {

	public static void main(String[] args) {
		/*
		 * Gym Information
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Olympia Gym!");

		System.out.print("Name Surname : ");
		String name = scanner.nextLine();

		System.out.print("Age: ");
		int age = scanner.nextInt();

		System.out.print("Weight: ");
		double weight = scanner.nextDouble();

		System.out.print("Height: ");
		double height = scanner.nextDouble();

		System.out.print("Subscription month: ");
		int month = scanner.nextInt();

		int monthly_price = 20;

		int result = monthly_price * month;

		System.out.print("Result : " + result + " $ ");
		scanner.close();
	}

}
