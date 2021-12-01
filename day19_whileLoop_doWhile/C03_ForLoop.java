package day19_whileLoop_doWhile;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tam sayi giriniz ");
		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		int rakam = 0;

		rakamlarToplami = 0;
		String sayiStr = "" + sayi;
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}
}
