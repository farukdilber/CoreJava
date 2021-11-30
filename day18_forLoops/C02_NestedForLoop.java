package day18_forLoops;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen 10'dan kucuk pozitif bir tam sayi girin ");
	        int sayi=scan.nextInt();
	        for (int satir = 1; satir <=sayi; satir++) {
				for (int i = 1; i <= satir; i++) {
					System.out.print(i+" ");
				}
	        	System.out.println(" ");
			}
	scan.close();
	}

}
