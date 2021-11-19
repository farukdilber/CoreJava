package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen isminizi giriniz :" );
       String isim=scan.next();
       System.out.println("Lutfen soyisminizi giriniz :");
       String soyisim=scan.next();
       System.out.println("Girilen isim : " + isim + " " + soyisim );
          scan.close();	
	}

}
