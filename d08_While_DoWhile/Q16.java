package d08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
	 public static void main(String[] args) {

	        // --------GÝRÝLEN SAYININ BASAMAKLARINDAKÝ RAKAMLARIN TOPLAMINI BULUNUZ.


	        Scanner sc = new Scanner(System.in);
	        System.out.println("Bir sayý giriniz: ");
	        int sayi = sc.nextInt();
	        int toplam = 0;

	        do {

	            toplam += sayi % 10;
	            sayi = sayi / 10;

	            System.out.println("Basamaðýn Toplamý = " + toplam + "kalan sayý " + sayi);

	        }
	        while (sayi > 0);
	        System.out.println("Toplam = " + toplam);

	    }
}
