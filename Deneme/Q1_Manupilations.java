package Deneme;

import java.util.Scanner;

public class Q1_Manupilations {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin eger
		// 4-5-6 bank karti sadece ilk 8 karekteri gizle,
		// ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B*******
		// kart no : **** **** **** 1234
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim = scan.nextLine();
		System.out.println("Lutfen 16 haneli kart numarasi giriniz");
		String kartNo = scan.next();

		String isimSekli = isim.substring(0, 2).toUpperCase() + isim.substring(2).replaceAll("\\w", "*");
		String soyisimSekli = soyisim.substring(0, 2).toUpperCase() + soyisim.substring(2).replaceAll("\\w", "*");
		String kartSekli = "**** **** ****" + kartNo.substring(12);
		System.out.println(isimSekli + "" + soyisimSekli);
		System.out.println(kartSekli);
		scan.close();
	}

}
