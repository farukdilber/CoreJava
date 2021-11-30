package day18_forLoops;

import java.util.Scanner;

public class C04_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		int toplam = 0;
		int sayac = 0;
		while (sayi != 0) {
			System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nbitirmek icin 0'a basin");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;
		}
		System.out.println("Girilen sayi adedi =" + (sayac - 1));
		System.out.println("Girilen sayilar toplami =" + toplam);
		scan.close();
	}

}
