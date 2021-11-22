package d04_SwitchCase;

import java.util.Scanner;

public class C03_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scan = new Scanner(System.in);
	        System.out.print("Month No =");
	        int monthNo = scan.nextInt();



	        switch (monthNo) {
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                System.out.println("Month 31 days");
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                System.out.println("Month 30 days");
	                break;
	            case 2:
	                System.out.print("yýl = ");
	                int yil = scan.nextInt();
	                if (yil % 4 == 0)
	                    System.out.println("Month 29 days");
	                else
	                    System.out.println("Month 28 days");
	                break;

	            default:
	                System.out.println("Try Again!!!");
	        }
	        scan.close();
	}

}
