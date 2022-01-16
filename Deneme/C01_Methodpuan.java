package Deneme;

import java.util.Scanner;

public class C01_Methodpuan {

	public static void main(String[] args) {
		/*
		 * Kullanicidan kredi karti limiti ve birikmis puanlarini sorun bonus
		 * eklendikten sonra yeni puani ile bilgilendirin kart limit 5 ve puan 500den az
		 * ise yuzde 10 ver kart limit 5-10arasi ve puan 500den fazla ise yuzde 20 ver
		 * 10 uzeri ve puan 1000den fazla ise yuzde 50 ver
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kartlimit no giriniz ");
		int kartLimit = scan.nextInt();
		System.out.println("Lutfen puan giriniz ");
		int puan = scan.nextInt();

		puan += puanHesapla(kartLimit, puan);
		System.out.println("Genel toplam puan :" + puan);

		scan.close();

	}

	private static int puanHesapla(int kartLimit, int puan) {
		int bonus = 0;
		if (kartLimit < 5 && puan < 500) {

			bonus = 100;

		} else if (kartLimit >= 5 && kartLimit <= 10 && puan >= 500 && puan <= 1000) {
			bonus = 200;

		} else if (kartLimit >= 10 && puan >= 1000) {
			bonus = 1000;

		} else {
			System.out.println("Lutfen gecerli bir limit no giriniz");

		}

		return bonus;
	}

}
