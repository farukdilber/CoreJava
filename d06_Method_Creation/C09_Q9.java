package d06_Method_Creation;

import java.util.Scanner;

public class C09_Q9 {

	public static void main(String[] args) {
		/*
		 * Problem Tan�m�: addDigits isminde bir method olu�turun. Parametresi int
		 * Return tipi de int Pozitif int de�erler ver ve en son sonu� tek basamakl�
		 * ��kana kadar basamaklar� birbiriyle topla. Tek basamakl� ��kt���nda, d�nd�r�n
		 * �rnek1: Girdi 38 ��kt�: 2 A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1
		 * = 2. 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		int num = scanner.nextInt();

		System.out.println(addDigits(num));

		scanner.close();
	}

	public static int rakamTopla(int sayi) {
		/*
		 * String str = String.valueOf(num);//num a girilen int de�erlerini str ye ata
		 * String[] arr = str.split("");//str deki arr arraysa ata int sum = 0; for (int
		 * i = 0; i < arr.length; i++) { sum += Integer.parseInt(arr[i]); } return sum;
		 */

		int toplam = 0;
		int rakam = 0;

		while (sayi > 0) {

			rakam = sayi % 10;
			toplam += rakam;
			sayi /= 10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami: " + toplam);

		return toplam;
	}

	public static int addDigits(int num) {
		nasil("kolay gelsin method run oluyor");
		for (int i = 0; i < 2; i++) {
			num = rakamTopla(num);// girilen int num say�s�n� sum metoduna g�nder gelen de�eri tekrar num a ata
									// tekrar sum a g�nder

			if (num < 10)// tek basamakl� yani rakamsa kodu k�r.
				break;
		}
		// gozunAydin("helal olsun bu method calistiysa dewamkeee");
		return num;
	}

	private static void gozunAydin(String naber) {
		System.out.println("gozunAydin method calisti" + naber);
	}

	private static void nasil(String mesaj) {
		System.out.println("nas�l methodu calisti :" + mesaj);
		gozunAydin("helal olsun bu method calistiysa dewamkeee");

	}

}
