package day12_StringManupilations2;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bir cumle giriniz");
	        String cumle=scan.nextLine();
	        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz ");
	        String kelime=scan.next();
	        int ilkIndex=cumle.indexOf(kelime);
	        int sonIndex=cumle.lastIndexOf(kelime);
	        if (ilkIndex==(-1)) {
	        	System.out.println("Girilen kelime cumlede kullanilmamis");
				
			}else if(ilkIndex==sonIndex) {
				System.out.println("Girilen kelime 1 defa kullanilmis"); 
				
			}else {
				System.out.println("Girilen kelime 1 den fazla kullanilmis");
			}
scan.close();
}

}
