package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C07_Q7 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please write   X and Y  values ");
	        int x = scan.nextInt();
	        int y = scan.nextInt();

	        if (x > 0 && y > 0) {
	            System.out.println(" 1. Area");
	        } else if (x < 0 && y > 0) {
	            System.out.println(" 2. Area");
	        } else if (x < 0 && y < 0) {
	            System.out.println(" 3. Area");
	        } else if (x > 0 && y < 0) {
	            System.out.println(" 4. Area");
	        } else if (x == 0 && y!=0) {
	            System.out.println(" Y axis");
	        } else if (y == 0 && x!=0) {
	            System.out.println(" X axis");
	        }else {
	            System.out.println("Origin ");
	        }
	        scan.close();
	}

}
