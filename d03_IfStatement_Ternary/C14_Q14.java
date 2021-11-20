package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C14_Q14 {

	public static void main(String[] args) {
		//  ax^2 + bx + c;
		Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsayýlarýný giriniz : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Girdiðiniz denklemin iki tane kökü vardýr\nX1= " + x1 + " X2= " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Girdiðiniz denklemin 1 tane kökü vardýr\nx= " + x);
        } else {
            System.out.println("Girdiðiniz denklemin kökü yoktur");
        }
        scan.close();
	}

}
