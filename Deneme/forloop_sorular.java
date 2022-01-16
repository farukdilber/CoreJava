package Deneme;

import java.util.Iterator;
import java.util.Scanner;

public class forloop_sorular {

	public static void main(String[] args) {
//		Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari

//toplayip, sonucu yazdiran bir program yaziniz 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen  sayi girin ");
		double sayi1 = scan.nextDouble();
		
		double toplam = 1;
		
			for (double i = 1; i <= sayi1; i++) {
				toplam *= i;
			}
			System.out.println("sayinin faktoriyeli " + toplam);
}
}