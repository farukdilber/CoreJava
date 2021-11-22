package day05_MatIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan =new Scanner(System.in);
       System.out.println("Lutfen uc basamakli sayi giriniz :");
       int sayi=scan.nextInt();
       int rakamlarToplami=0 ;
       int rakam=sayi%10;
       rakamlarToplami+=rakam;
       sayi/=10;
       rakam=sayi%10;
       rakamlarToplami+=rakam;
       sayi/=10;
       rakamlarToplami+=sayi;
       System.out.println("Girdiginiz rakamlar toplami ;" + rakamlarToplami);
       scan.close();
       
    		   
	}

}
