package d02_ScannerQ;

import java.util.Scanner;

public class C02_Q2 {

	public static void main(String[] args) {
		/*Please enter three digits numbers
		 * Inputs : 853
          Output :  : 3
                    : 5
                    : 8 
         */
       Scanner scan=new Scanner (System.in);
       System.out.println("Enter three digits numbers");
       int num=scan.nextInt();
       int first=num%10;
       int second=(num/10)%10;
       int third=num/100;
       System.out.println(first+"\n"+second+"\n"+third);
       scan.close();
	}

}
