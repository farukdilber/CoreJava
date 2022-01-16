package Deneme;

import java.util.Scanner;

public class C01_emailKontrol {

	public static void main(String[] args) {
		// Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre

//- @ isareti icermiyorsa gecersiz email yazdirin
//- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
//- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz ");
		String mail = scan.next();
		mail = kontrol(mail);

		System.out.println("Sifre olusturun(Ilk harf buyuk-En az 8karekter-Bosluk olmasin) ");
		String sifre = scan.next();
        sifre=kontrols(sifre);
        System.out.println("Mail :" + mail + " " +"Sifre :" + sifre);
		scan.close();
	}

	private static String kontrols(String sifre) {
		char a = sifre.charAt(0);
		char z = sifre.charAt(sifre.length()-1);
		if ((a >= 'A' && a <= 'Z') && (z >= 'a' && z <= 'z')) {
		}else if (sifre.startsWith(String.valueOf(a)) && !sifre.contains(" ") && sifre.length() >= 8
					&& sifre.endsWith(String.valueOf(z))) {
				System.out.println("Þifre baþarý ile tanýmlandý");
		}	else {
				System.out.println("Ýþlem baþarýsýz");
			} 
		return sifre;
		}
		
	
	private static String kontrol(String mail) {
		if (!mail.contains("@")) {
			System.out.println("Gecersiz Email");

		} else if (!mail.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		} else if (!mail.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var,maili kontrol ediniz");
		} else {
			System.out.println("Mail adresiniz olusturuldu");
		}
		return mail;

	}

}
