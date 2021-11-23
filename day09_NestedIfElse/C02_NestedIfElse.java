package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort basamakli bir sayi girin ");
		int sayi =scan.nextInt();
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 Basamakli sayi giriniz ");
		}
		else {
			if (sayi%5==0) {
				
			if (sayi%10==0) {
				System.out.println("Bese tam bolunen cift sayi");
			} else {
			 System.out.println("Bese tam bolunen tek sayi");
			}
			}	else {
				System.out.println("Tekrar deneyin");
			}
		}
		scan.close();
	}
	}

