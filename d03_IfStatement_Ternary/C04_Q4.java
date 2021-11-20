package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C04_Q4 {

	public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Height(CM) : ");
        double height =scan.nextDouble()/100;


        System.out.println("WEIGHT(KG) : ");
        double weight =scan.nextDouble();

        double bmi = weight/(height*height);
        if(bmi<=20) {
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Underweight");

        }else if(bmi>20 && bmi<=25) {
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normal");

        }else if(bmi>25 && bmi<=30) {
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Overweight");

        }else if(bmi>30) {
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obese");

        }
        scan.close();


	}

}
