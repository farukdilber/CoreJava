package Deneme;

import java.util.Scanner;

public class C04_Sifre2 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir �ifre giriniz");
    String sifre = scan.nextLine();
    char a = sifre.charAt(0);
    char z = sifre.charAt(sifre.length() - 1);
    if ((a >= 'A' && a <= 'Z') && (z >= 'a' && z <= 'z')) {
        if (sifre.startsWith(String.valueOf(a)) && !sifre.contains(" ") && sifre.length() >= 8 && sifre.endsWith(String.valueOf(z)))
            System.out.println("�ifre ba�ar� ile tan�mland�");
        else {
            System.out.println("��lem ba�ar�s�z");
        }
    } else {
        System.out.println("��lem ba�ar�s�z");
    }
    scan.close();
}
}