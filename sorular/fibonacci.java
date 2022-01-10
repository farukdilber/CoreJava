package sorular;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int arr[] = {3,5,1,2,7,9,2,3,5,7};
		int oncekiSayi = 0;
		int sonrakiSayi = 1;

		System.out.println("Fibonacci serisi uzunlugu :");
		Scanner scanner = new Scanner(System.in);
//		maxsayi = scanner.nextInt();
//		System.out.println("Fibonacci serisi " + toplam + " sayilar toplami :");

		for (int i = 1; i <= arr.length; ++i) {
			

			int toplam = oncekiSayi + sonrakiSayi;
			oncekiSayi = sonrakiSayi;
			sonrakiSayi = toplam;
			System.out.print(oncekiSayi + " ");
		}
		scanner.close();
	}

}
