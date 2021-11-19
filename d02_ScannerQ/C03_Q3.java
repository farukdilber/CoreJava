package d02_ScannerQ;

import java.util.Scanner;

public class C03_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Lutfen 1. sayiyi giriniz");

		double num1 = sc.nextDouble();

		System.out.println("Lutfen 2. saysayiyi giriniz");
		double num2 = sc.nextDouble();

		System.out.println("Toplam: " + (num1 + num2));
		System.out.println("Fark: " + (num1 - num2));
		System.out.println("Carpim: " + (num1 * num2));
		System.out.println("Bolum: " + (num1 / num2));

		sc.close();
	}

}
