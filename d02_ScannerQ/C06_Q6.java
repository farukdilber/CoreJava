package d02_ScannerQ;

import java.util.Scanner;

public class C06_Q6 {

	public static void main(String[] args) {
		/*
		 * Distance(KM): 400 Speed(KM/H: 100 Calculate Time : 4
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Distance(km): ");
		double distance = scanner.nextDouble();

		System.out.print("Speed(km/sa): ");
		double speed = scanner.nextDouble();

		double time = distance / speed;
		System.out.print("Approximate : " + time + " hours");
		scanner.close();
	}

}
