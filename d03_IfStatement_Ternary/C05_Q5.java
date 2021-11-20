package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C05_Q5 {

	public static void main(String[] args) {
		/*
		 * 
		 * job = qa ==> Quality Analyst dev ==> Developer ba ==> Busines Analyst pm ==>
		 * Project Manager
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("qa\ndev\nba\npm\nChoose your job :");
		String jobTitle = input.next();

		String qa = "Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";

		if (jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("JOB : " + qa);

		} else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("JOB : " + dev);
		} else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("JOB : " + ba);
		} else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("JOB : " + pm);
		} else {
			System.out.println("TRY AGAIN!");
		}

		input.close();

	}

}
