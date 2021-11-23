package day08_IfElse;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Lutfen yasini giriniz ");
         int yas=scan.nextInt();
         if (yas<65) {
        	 System.out.println("Emekli olamazsiniz ");
			}
         else {
        	 System.out.println("Emekli olabilirsiniz ");
			
		}
scan.close();
	}

}
