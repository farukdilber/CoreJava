package d07_ForLoop;

import java.util.Scanner;

public class C12_Q12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir tamsayý giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {

			toplam = (i * i) + toplam;

		}
		System.out.println("Sayýlarýn kareleri toplamý: " + toplam);
		scanner.close();
	}

}
