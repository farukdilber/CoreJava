package Deneme;

import java.util.Scanner;

public class C04_Sifre2 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Bir þifre giriniz");
    String sifre = scan.nextLine();
    char a = sifre.charAt(0);
    char z = sifre.charAt(sifre.length() - 1);
    if ((a >= 'A' && a <= 'Z') && (z >= 'a' && z <= 'z')) {
        if (sifre.startsWith(String.valueOf(a)) && !sifre.contains(" ") && sifre.length() >= 8 && sifre.endsWith(String.valueOf(z)))
            System.out.println("Þifre baþarý ile tanýmlandý");
        else {
            System.out.println("Ýþlem baþarýsýz");
        }
    } else {
        System.out.println("Ýþlem baþarýsýz");
    }
    scan.close();
}
}