package day18_forLoops;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int sayý=0;
        int sayac=0;
        int toplam=0;
        
        while (sayac<=10 && toplam<=500) {
            System.out.println("Lütfen toplama iþlemi için sayýlarý arka arkaya girin:");
            sayý=scan.nextInt();
            toplam+=sayý;
            sayac++;
        }
            
        System.out.print("Bu kadar sayý yeter.\n" + sayac + " adet sayý girdin,\n" + "toplamý : " + toplam);
    
        scan.close();
	}

}
