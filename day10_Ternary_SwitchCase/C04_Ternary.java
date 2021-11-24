package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz ");
		double sayi=scan.nextDouble();
		System.out.println(sayi>0 ? "Pozitif" : "Negatif");
		scan.close();

	}

}
