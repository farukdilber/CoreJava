package day19_whileLoop_doWhile;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz ");
		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		int rakam = 0;
		while (sayi > 0) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
		}

		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
