package day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini
		// girerse,
//		kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. Kullanici
//		toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben
//		toplayamam” yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen toplamak istediginiz sayi adedini giriniz  : ");
		int sayi1 = scan.nextInt();
		if (sayi1 == 2) {
			System.out.println("Toplamak istediginiz sayilari girin ");
			int sayi2 = scan.nextInt();
			int sayi3 = scan.nextInt();
			toplam(sayi2, sayi3);
		} else if (sayi1 == 3) {
			System.out.println("Toplamak istediginiz sayilari girin ");
			int sayi2 = scan.nextInt();
			int sayi3 = scan.nextInt();
			int sayi4 = scan.nextInt();
			toplam1(sayi2, sayi3, sayi4);
		} else if (sayi1 == 4) {
			System.out.println("Toplamak istediginiz sayilari girin ");
			int sayi2 = scan.nextInt();
			int sayi3 = scan.nextInt();
			int sayi4 = scan.nextInt();
			int sayi5 = scan.nextInt();
			toplam2(sayi2, sayi3, sayi4, sayi5);
		}

		else {
			System.out.println("Cok sayi girdiniz,ben toplayamam");

		}
		scan.close();
	}

	private static void toplam(int sayi2, int sayi3) {
		System.out.println(sayi2 + sayi3);

	}

	private static void toplam1(int sayi2, int sayi3, int sayi4) {
		System.out.println(sayi2 + sayi3 + sayi4);

	}

	private static void toplam2(int sayi2, int sayi3, int sayi4, int sayi5) {
		System.out.println(sayi2 + sayi3 + sayi4 + sayi4);

	}
}
