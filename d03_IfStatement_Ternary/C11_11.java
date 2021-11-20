package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C11_11 {

	public static void main(String[] args) {
//		Traffic ticket and license
		Scanner scan = new Scanner(System.in);
        System.out.print("Do you have license 1 , not 0 press : ");

        int license = scan.nextInt();

        System.out.print("Enter your speed : ");

        int speed = scan.nextInt();

        if (license == 1) {
            if (speed < 0) {
                System.out.println("Try Again!");
            } else if (speed > 54 && speed < 75) {
                System.out.println("Ticket 100 $");
            } else if (speed >= 75 && speed < 85) {
                System.out.println("Ticket 150 $");
            } else if (speed >= 85 && speed < 95) {
                System.out.println("Ticket 320 $");
            } else if (speed >= 95) {
                System.out.println("Ticket 500 $");
            } else {
                System.out.println("You are belove the speed limit,have a nice trip.. ");
            }
        } else if (license == 0) {
            if (speed > 54 && speed < 75) {
                System.out.println("Ticket 300 $");
            } else if (speed >= 75 && speed < 85) {
                System.out.println("Ticket 350 $");
            } else if (speed >= 85 && speed < 95) {
                System.out.println("Ticket 520 $");
            } else if (speed >= 95) {
                System.out.println("Ticket 700 $");
            } else {
                System.out.println("Driving without license ticket price 200 $ ");
            }
        } else {
            System.out.println("Enter a valid value!");
      }
        scan.close();
	}

}
