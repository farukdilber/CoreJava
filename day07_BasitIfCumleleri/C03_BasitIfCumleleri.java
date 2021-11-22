package day07_BasitIfCumleleri;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Lutfen bir gun ismi giriniz");
         String gun =scan.next().toLowerCase();
         if (gun.equals("pazar") || gun.equals("cumartesi")) {
        	 System.out.println("Hafta sonu");
			}
         if(gun.equals("pazartesi") ||gun.equals("sali") ||gun.equals("carsamba") ||gun.equals("persembe")
        		 ||gun.equals("cuma") );
         System.out.println("Haftaici");
       scan.close();  
	}

}
