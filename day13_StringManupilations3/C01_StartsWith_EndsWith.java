package day13_StringManupilations3;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen bir cumle giriniz");
           String cumle=scan.nextLine();
           System.out.println("Lutfen kelime giriniz");
           String kelime=scan.next();
           if (cumle.startsWith(kelime)) {
			System.out.println("Girilen cumle" + kelime + "ile basliyor");
		}else {
			System.out.println("Girilen cumle" + kelime + "ile basliyor");
		}
           if (cumle.endsWith(kelime)) {
        	   System.out.println("Girilen cumle" + kelime +"ile bitiyor");
			
		}
           else {
			System.out.println("Girilen cumle" + kelime + "ile bitmiyor");
		}
           scan.close();
	}

}
