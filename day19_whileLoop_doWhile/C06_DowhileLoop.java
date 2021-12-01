package day19_whileLoop_doWhile;

import java.util.Scanner;

public class C06_DowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sifre = " ";
		boolean khk = false;
		boolean bhk = false;
		boolean okk = false;
		boolean uk = false;
		do {
			System.out.println("Lutfen bir sifre giriniz");
			sifre = scan.nextLine();
			khk = kucukHarfKontrol(sifre);
			bhk = buyukHarfKontrol(sifre);
			okk = ozelKarekterKontrol(sifre);
			uk = uzunlukKontrol(sifre);
		} while (!khk || !bhk || !okk || !uk);
		System.out.println("Sifreniz basari ile tanimlandi");
		scan.close();
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk = false;
		if (sifre.length() >= 8) {
			uk = true;
		} else {
			System.out.println("Sifreniz en az 8 karekter olmalidir ");
		}
		return uk;
	}

	private static boolean ozelKarekterKontrol(String sifre) {
		boolean okk = false;
		String harfler = "!@#$%^&*()_+[]|}{.,><''";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				okk = true;
				break;
			}
		}
		if (!okk) {
			System.out.println("Sifreniz en az bir ozel karekter icermelidir ");
		}
		return okk;
	}

	private static boolean buyukHarfKontrol(String sifre) {
		boolean bhk = false;
		String harfler = "ABCDEFGHIJKLMNOPRESTUVYZWQX";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				bhk = true;
				break;
			}
		}
		if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir ");
		}
		return bhk;
	}

	private static boolean kucukHarfKontrol(String sifre) {
		boolean khk = false;
		String harfler = "abcdefghijklmnoprestuvyzqwx";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i, i + 1))) {
				khk = true;
				break;
			}
		}
		if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir ");
		}
		return khk;
	}

}
