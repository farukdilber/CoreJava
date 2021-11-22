package d04_SwitchCase;

import java.util.Scanner;

public class C02_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.print("3 digits number = ");
	        int num = scan.nextInt();



	        int First = num / 100;
	        int Second = (num / 10) % 10;
	        int Third = num % 10;

	        switch (First) {
	            case 1:
	                System.out.println("");
	                break;
	            case 2:
	                System.out.println("two");
	                break;
	            case 3:
	                System.out.println("three");
	                break;
	            case 4:
	                System.out.println("four");
	                break;
	            case 5:
	                System.out.println("five");
	                break;
	            case 6:
	                System.out.println("six");
	                break;
	            case 7:
	                System.out.println("seven");
	                break;
	            case 8:
	                System.out.println("eight");
	                break;
	            case 9:
	                System.out.println("nine");
	                break;
	        }
	       System.out.println("hundred");

	        switch (Second) {
	            case 1:
	                System.out.println("ten");
	                break;
	            case 2:
	                System.out.println("twenty");
	                break;
	            case 3:
	                System.out.println("thirty");
	                break;
	            case 4:
	                System.out.println("fourty");
	                break;
	            case 5:
	                System.out.println("fifty");
	                break;
	            case 6:
	                System.out.println("sixty");
	                break;
	            case 7:
	                System.out.println("seventy");
	                break;
	            case 8:
	                System.out.println("eighty");
	                break;
	            case 9:
	                System.out.println("ninety");
	                break;
	        }

	        switch (Third) {
	            case 1:
	                System.out.println("one");
	                break;
	            case 2:
	                System.out.println("two");
	                break;
	            case 3:
	                System.out.println("three");
	                break;
	            case 4:
	                System.out.println("four");
	                break;
	            case 5:
	                System.out.println("five");
	                break;
	            case 6:
	                System.out.println("six");
	                break;
	            case 7:
	                System.out.println("seven");
	                break;
	            case 8:
	                System.out.println("eight");
	                break;
	            case 9:
	                System.out.println("nine");
	                break;
	        }
	        scan.close();
	}

}
