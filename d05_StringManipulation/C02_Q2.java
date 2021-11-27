package d05_StringManipulation;

import java.util.Scanner;

public class C02_Q2 {

	public static void main(String[] args) {
		// Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye
		// ayýrýnýz,
		// ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
		String adSoyad = scan.nextLine();

		// Ahmet Yýlmaz substring(baþlangýç index, e kadar - dahil deðil)

		String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
		String Soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1);

		System.out.println("ad = " + ad); // ad = kader
		System.out.println("Soyad = " + Soyad); // Soyad = Esen
		scan.close();
	}

}
