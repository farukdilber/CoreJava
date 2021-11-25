package day12_StringManupilations2;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bir cumle giriniz");
	        String cumle=scan.nextLine();
	        System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz ");
	        char krk=scan.next().charAt(0);
	        int index=cumle.lastIndexOf(krk);
	        if (index==(-1)) {
	        	System.out.println("Harf cumlede kullanilmis");
	        	
				
			}else {
				System.out.println("Harf cumlede kullanilmamis");
			}
	        scan.close();
	}

}
