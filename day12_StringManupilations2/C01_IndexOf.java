package day12_StringManupilations2;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Lutfen bir cumle giriniz");
     String cumle=scan.nextLine();
     System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
     String krk=scan.next();
     int index=cumle.indexOf(krk); // girilen karekterin cumledeki indexini verir index==(-1) de olur
     if (index<0) {
    	 System.out.println("Girdiginiz harf verilen cumlede yok" );   //krk.substring(0).replaceAll("\\w", "*"
    	 }
     else {
		System.out.println("Girdiginiz harf verilen cumlede var");
	}
     scan.close();
	}

}
