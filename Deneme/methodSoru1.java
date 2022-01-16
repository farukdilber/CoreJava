package Deneme;

import java.util.Scanner;

public class methodSoru1 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan
		// buyuk mu
//		kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
//		rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
//		olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz ");
		int sayi1 = scan.nextInt();
		if (sayi1 % 2 == 0) {
			tekcift(sayi1);
		} else if (sayi1 % 2 != 0) {
			tekcift1(sayi1);
		}
		if (sayi1 > 100) {
			System.out.println(sayi1 % 10 + (sayi1 / 10) % 10 + (sayi1 / 100));
		} else  {
			System.out.println(sayi1 % 10);
		}
		scan.close();
	}

	private static void tekcift(int sayi1) {
		System.out.println(("Sayiniz : " + sayi1 + " cift") + "\n" + (sayi1 > 0 ? "Sifirdan buyuk" : "Sifirdan kucuk")
				+ "\nEger sayi 3 basamakli ise rakamlar toplami: ");
	}

	private static void tekcift1(int sayi1) {
		System.out.println(("Sayiniz : " + sayi1 + " tek") + "\n" + (sayi1 < 0 ? "Sifirdan kucuk" : "Sifirdan buyuk")
				+ "\nEger sayi 3 basamakli ise rakamlar toplami: ");
	}

}
