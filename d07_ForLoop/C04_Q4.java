package d07_ForLoop;

import java.util.Scanner;

public class C04_Q4 {

	public static void main(String[] args) {
		// Kullanýcýdan 5 adet sayý isteyiniz
		// Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
		// bu soruyu continue kullanarak çözünüz.

		Scanner scan = new Scanner(System.in);

		int toplam = 0;
		for (int i = 1; i <= 5; i++) // 5 kez sayý isteme kontrolu
		{
			System.out.print("Bir sayý giriniz : ");
			int sayi = scan.nextInt();

			if (sayi > 5 && sayi < 10) // 5 ile 10 arasý-> 6,7,8,9
			{
				System.out.println("girdiðiniz sayý 5 ile 10 arasý olduðundan isleme girmeyecek");
				continue;
			}

			toplam += sayi;
		}

		System.out.println("girdiginiz sayilarin toplamý :" + toplam);
		scan.close();
	}

}
