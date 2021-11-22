package day07_BasitIfCumleleri;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir tam sayi giriniz");
int sayi=scan.nextInt();
if (sayi%2==0) {
	System.out.println("Sayiniz cift");	
}if (sayi%2==1) {
System.out.println("Girdiginiz sayi tektir");	
	}
scan.close();
	}

}
