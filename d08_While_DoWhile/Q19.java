package d08_While_DoWhile;

import java.util.Scanner;

public class Q19 {
	  public static void main(String[] args) {
	         /*
	        Girilen bir say�ya kadar olan say�lardan sadece tek olanlar�n� ekrana yazd�r�n�z.
	         girilen say� dahil
	        */
	        Scanner oku = new Scanner(System.in);
	        System.out.print("say� giriniz =");
	        int sayi = oku.nextInt(); //5

	        //sayi--; bu �ekilde say�n�n kendisi i�leme girmez

	        int toplam = 0;
	        while (sayi > 0) {
	            if (sayi % 2 == 1)
	                System.out.println(sayi);

	            sayi--; // 5 4 3 2 1
	        }

	    }
}
