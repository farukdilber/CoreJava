package day09_NestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {
	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Lutfen gecerli bir sifre giriniz");
	   char ilkKarekter=scan.next().charAt(0);
	   if (ilkKarekter>='A' && ilkKarekter<='Z') {
		if(ilkKarekter=='A') {
			System.out.println("Gecerli sifre");
		}else {
			System.out.println("Gecersiz sifre");
		}
	 }else if (ilkKarekter>='a' && ilkKarekter<='z') {
		if (ilkKarekter=='z') {
			System.out.println("Gecerli sifre");
			
		} else {
			System.out.println("Gecersiz sifre");
		}
	} else {
		System.out.println("Lutfen gecerli bir sifre icin harf ile baslayin ");
	}
		
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
