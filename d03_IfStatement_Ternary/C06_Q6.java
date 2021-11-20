package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C06_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Luften yasinizi giriniz : ");
		int age = sc.nextInt();
		System.out.print("lütfen kilonuzu giriniz : ");
		int weight = sc.nextInt();

		if (age > 0 && age < 18) {
			System.out.println("Those under the age of 18 cannot donate blood.");
		} else if (age >= 18) {
			if (weight > 0 && weight < 50) {
				System.out.println("You cannot donate blood because your weight is less than 50.");
			} else if (weight >= 50) {
				System.out.println("You can donate blood.");
			} else {
				System.out.println("You wrote incorrect value");
			}
		} else {
			System.out.println("You entered incorrect value");
		}
		sc.close();
	}

}
