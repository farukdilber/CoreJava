package day13_StringManupilations3;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin eger
		// 4-5-6 bank karti sadece ilk 8 karekteri gizle,
		// ve kredi karti asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		// kart no : **** **** **** 1234
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim = scan.nextLine();
		System.out.println("Lutfen 16 haneli kart numarasi giriniz");
		String kartNo = scan.next();
		String kartSekli2 = "**** ****" + kartNo.substring(8);
		String isimSekli = isim.substring(0, 2).toUpperCase() + isim.substring(2).replaceAll("\\w", "*");
		String soyisimSekli = soyisim.substring(0, 2).toUpperCase() + soyisim.substring(2).replaceAll("\\w", "*");

		if (kartNo.substring(0, 1).equals("4")) {
//			String kartSekli2 = "**** ****" + kartNo.substring(8);
			System.out.println("Girdiginiz numara bankkartina aittir " + kartSekli2);
			System.out.println(isimSekli + "" + soyisimSekli);
		} else if (kartNo.substring(0, 1).equals("5")) {

			System.out.println("Girdiginiz numara bankkartina aittir " + kartSekli2);
			System.out.println(isimSekli + "" + soyisimSekli);
		} else if (kartNo.substring(0, 1).equals("6")) {

			System.out.println("Girdiginiz numara bankkartina aittir " + "\n"+ kartSekli2);
			System.out.println(isimSekli + "" + soyisimSekli);
		} else {
			System.out.println("Girdiginiz numara kredi kartina aittir ");

			String kartSekli = "**** **** ****" + kartNo.substring(12);
			System.out.println(isimSekli + "" + soyisimSekli);
			System.out.println(kartSekli);
			scan.close();
		}
	}
}
