package d02_ScannerQ;

import java.util.Scanner;

public class C04_Q4 {

	public static void main(String[] args) {
		 /* 
	         *   input  : 12345
	         *   output : 12
	         */
		  Scanner sc = new Scanner(System.in);

	        System.out.println("Please write a five digits number : ");

	        int num = sc.nextInt(); 

	        int ilkIki = num / 1000; 

	        int sonIki = num % 100; 

	        int iklIkiTop = (ilkIki % 10) + (ilkIki / 10);

	        int sonIkiTop = (sonIki % 10) + (sonIki / 10);


	        System.out.println("Result : " + (iklIkiTop + sonIkiTop));


	        sc.close();

         
	}

}
