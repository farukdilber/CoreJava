package day18_forLoops;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int say�=0;
        int sayac=0;
        int toplam=0;
        
        while (sayac<=10 && toplam<=500) {
            System.out.println("L�tfen toplama i�lemi i�in say�lar� arka arkaya girin:");
            say�=scan.nextInt();
            toplam+=say�;
            sayac++;
        }
            
        System.out.print("Bu kadar say� yeter.\n" + sayac + " adet say� girdin,\n" + "toplam� : " + toplam);
    
        scan.close();
	}

}
