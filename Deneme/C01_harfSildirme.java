package Deneme;

import java.util.Scanner;

public class C01_harfSildirme {

	public static void main(String[] args) {

		losen();

	}

	private static void losen() {
		Scanner scan = new Scanner(System.in);
		System.out.println("kacinci karakteri silmek istiyorsunz.?");
		int kacinci = scan.nextInt();
		String cumle = "onur cetiner";
		if (kacinci == 0) {
			cumle = cumle.replace(cumle.substring(kacinci, kacinci + 1), "");
			System.out.println(cumle);
		} else if (kacinci == 1) {
			cumle = cumle.replace(cumle.substring(kacinci, kacinci + 1), "");
			System.out.print(cumle);
		} else if (kacinci == 2) {
			cumle = cumle.replace(cumle.substring(kacinci, kacinci + 1), "");
			System.out.println(cumle);
		}
		scan.close();
	}

}
