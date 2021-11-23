package day08_IfElse;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir dikdortgen kenari giriniz :");
		double kenar1 = scan.nextDouble();
		System.out.println("Lutfen dikdortgenin diger kenari giriniz :");
		double kenar2 = scan.nextDouble();
		if (kenar1 == kenar2) {
			System.out.println("Girilen dikdortgen kare "); }
			else {
				System.out.println("Girilen dikdortgen kare degil ");

			}
			scan.close();
		
	}

}
