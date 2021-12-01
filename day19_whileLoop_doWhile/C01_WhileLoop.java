package day19_whileLoop_doWhile;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz ");
            int sayi=scan.nextInt();
            int sayac=0;
            int bolen=1;
            while (bolen<=sayi) {
				if (sayi%bolen==0) {
					System.out.print(bolen+" ");
				sayac++;
				
				}
				bolen++;
			}
           
            System.out.println("\n"+ sayi + " sayisinin " + sayac + " adet tam boleni vardir ");
            scan.close();
	}

}
