package d02_ScannerQ;

import java.util.Scanner;

public class C12_Q12 {

	public static void main(String[] args) {
		/*
		 * WORK PROBLEMS
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("Time taken by first worker : ");
		int oneWorker = scan.nextInt();

		System.out.print("How many workers going to work : ");
		int worker = scan.nextInt();

		int totalTime = oneWorker / worker;
		System.out.println("Finish to work : " + totalTime + " Hours");

		scan.close();
	}

}
