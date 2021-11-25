package day12_StringManupilations2;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz ");
        String kelime=scan.next();
        int index=cumle.indexOf(kelime);
        if(index<10) {
        	System.out.println("Girilen kelime cumlede kullanilmamistir");
        }else {
			
		}
	scan.close();
	}

}
