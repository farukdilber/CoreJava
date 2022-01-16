package Deneme;

import java.util.Scanner;

public class Hatagidermemethod {

	public static void main(String[] args) {
		/*
		 * Kullanicidan kredi karti limiti ve birikmis puanlarini sorun bonus
		 * eklendikten sonra yeni puani ile bilgilendirin kart limit 5 ve puan 500den az
		 * ise 100 ver kart limit 5-10arasi ve puan 500den fazla ise 200 ver 10 uzeri ve
		 * puan 1000den fazla ise 1000 ver
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kartlimit no giriniz ");
		int kartLimit = scan.nextInt();
		System.out.println("Lutfen puan giriniz ");
		int puan = scan.nextInt();
//         kartLimit+=limitarttir(kartLimit);
		puan += puanHesapla(kartLimit, puan);
		puan+=bonusHesapla(puan);
		puan += devirHesapla(puan);
		System.out.println(puan+puan);
       
		scan.close();
	}

	private static int bonusHesapla(int puan) {

		if (puan < 500) {
			puan += puan * 0.1;

		} else if (puan >= 500 && puan < 1000) {
			puan += puan * 0.25;
		} else {
			puan += puan * 0.5;
		}
		return puan;
	}

	private static int devirHesapla(int puan) {
		System.out.println("Gelecek aya devredecek puan :");
		bonusHesapla(puan);
		return puan;
	}

// 
	private static int limitarttir(int kartLimit) {
		if (kartLimit < 5) {
			kartLimit += 5 - kartLimit;

			System.out.println("Limit 5ten kucuk = Kartlimitiniz 5'e yukseltilmistir ");

		}
		return kartLimit;

	}

	private static int puanHesapla(int kartLimit, int puan) {
		int bonus = 0;
		if (kartLimit >= 5) {
			if (puan < 500) {
				bonus += puan * 0.1;

			} else if (puan >= 500 && puan < 1000) {
				bonus += puan * 0.25;
			} else {
				bonus += puan * 0.5;
			}
		} else {
			bonus = 0;
			System.out.println("Limit dusuk oldu ekstra bonus kazanamadiniz gelecek ay ");
			limitarttir(kartLimit);
		}

		return bonus;
	}
}
