package day18_forLoops;

import java.util.Scanner;

public class C01_Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aradaki sayilari ucer ucer yazdirmak icin iki tam sayi girin ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		if (sayi1 > sayi2) {
			for (int i = sayi1; i >= sayi2; i -= 3) {
				System.out.print(i + " ");
			}
		} else if (sayi1 < sayi2) {
			for (int i = sayi1; i <= sayi2; i += 3) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Girilen sayilar esit");
		}
		scan.close();
	}

}
