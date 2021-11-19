package d02_ScannerQ;

import java.util.Scanner;

public class C07_Q7 {

	public static void main(String[] args) {
		/*
		Calculate BMI
		BMI = Weight(LB) / Height^2 (INCHES)
		 INPUT      : Weight: 71
		                   Height: 1,72
		 OUTPUT  : BMI : 23
		 	 */
		Scanner scan = new Scanner(System.in);
        System.out.print("Your body weight in LB = ");

        double weight = scan.nextDouble();
        System.out.print("Your body height in INCHES = ");

        double height = scan.nextDouble();

        weight = weight / 100;  //uzunluk/=100

        double bmi =(703* (weight / (height * height)));

        System.out.println("Body Mass Index (BMI)= " + bmi);


        scan.close();
	}

}
