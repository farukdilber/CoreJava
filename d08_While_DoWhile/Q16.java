package d08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
	 public static void main(String[] args) {

	        // --------G�R�LEN SAYININ BASAMAKLARINDAK� RAKAMLARIN TOPLAMINI BULUNUZ.


	        Scanner sc = new Scanner(System.in);
	        System.out.println("Bir say� giriniz: ");
	        int sayi = sc.nextInt();
	        int toplam = 0;

	        do {

	            toplam += sayi % 10;
	            sayi = sayi / 10;

	            System.out.println("Basama��n Toplam� = " + toplam + "kalan say� " + sayi);

	        }
	        while (sayi > 0);
	        System.out.println("Toplam = " + toplam);

	    }
}
