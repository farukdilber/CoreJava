package Deneme;

import java.util.Scanner;

public class C01_IsimSoyisimKKmetot {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak
		 * kredi karti numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler
		 * kucuk olacak sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda
		 * bosluk olacak sekilde duzelten 2 method yazin, ve programda kullanabilmek
		 * icin duzenlenmis hallerini geri dondurun.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Isim  giriniz");
		String isim = scan.next();
		System.out.println("Soyisim giriniz");
		String soyisim = scan.next();
		System.out.println("Bosluk birakmadan kart no giriniz");
		String kkno = scan.next();
		
		isim = ismiduzelt(isim);
		soyisim = ismiduzelt(soyisim);
		String yenikkno = kartduzelt(kkno);
		scan.close();
	}

	private static String kartduzelt(String kkno) {
		System.out.println(kkno.substring(0, 4) + " " + kkno.substring(4, 8) + " " + kkno.substring(8, 12) + " "
				+ kkno.substring(12));
		return kkno;
	}

	private static String ismiduzelt(String isim) {
		System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase());
		return isim;
	}

}
