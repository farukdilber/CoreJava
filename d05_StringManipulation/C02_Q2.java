package d05_StringManipulation;

import java.util.Scanner;

public class C02_Q2 {

	public static void main(String[] args) {
		// Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye
		// ay�r�n�z,
		// ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
		String adSoyad = scan.nextLine();

		// Ahmet Y�lmaz substring(ba�lang�� index, e kadar - dahil de�il)

		String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
		String Soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1);

		System.out.println("ad = " + ad); // ad = kader
		System.out.println("Soyad = " + Soyad); // Soyad = Esen
		scan.close();
	}

}
