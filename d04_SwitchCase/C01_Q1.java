package d04_SwitchCase;

import java.util.Scanner;

public class C01_Q1 {

	public static void main(String[] args) {
		// Degree System
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a grade : ");
		int not = scan.nextInt();
		String note = scan.nextLine();

		if (not >= 0 && not < 50) {
			// not = 0;
			note = "Fail";
		} else if (not >= 50 && not < 60) {
			// not = 50;
			note = "Normal";
		} else if (not >= 60 && not < 80) {
			// not = 60;
			note = "Perfect";
		} else if (not >= 80 && not <= 100) {
			// not = 80;
			note = "Excellent";
		}

		switch (note) {

		case "Fail":
			System.out.println("D");
			break;
		case "Normal":
			System.out.println("C");
			break;
		case "Perfect":
			System.out.println("B");
			break;
		case "Excellent":
			System.out.println("A");
			break;
		default:
			System.out.println("Please enter a valid grade");
			break;
		}
		scan.close();
	}

}
