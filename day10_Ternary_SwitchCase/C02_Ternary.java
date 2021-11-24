package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz ");
		int sayi=scan.nextInt();
		System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");

	}

}
