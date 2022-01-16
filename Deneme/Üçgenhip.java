package Deneme;
import java.util.Scanner;

public class Üçgenhip {

	public static void main(String[] args) {

/*
	Kullaicadan uc sayi aliniz en kucugunu ve en buyugunu bulunuz
	

	 */
    Scanner scan =new Scanner(System.in);
    System.out.println("Lutfen 3 adet sayi giriniz ");
    
    int sayi1 = scan.nextInt();
    int sayi2 = scan.nextInt();
    int sayi3 = scan.nextInt();
    int enBuyuk = 0 ;
    
    if (sayi1>sayi2 && sayi1>sayi3) {
    	enBuyuk=sayi1 ;
    
    }
    else if  (sayi2>sayi1 && sayi2>sayi3) {
    	enBuyuk=sayi2 ;
    	
    }
    else if (sayi3>sayi1 && sayi3>sayi2) {
    	enBuyuk=sayi3 ;
    	
    }
    
    int enKucuk = 0 ;
    if (sayi1<sayi2 && sayi1<sayi3) {
    	enKucuk = sayi1 ;
    		}
    else if (sayi2<sayi1 && sayi2<sayi3) {
    		    	enKucuk = sayi2 ;
    		    				
    }
	
    else if (sayi3<sayi1 && sayi3<sayi2) {
    		    	enKucuk = sayi3 ;
    		    				
    }
    else {
    	System.out.println("Lutfen gecerli bir sayi giriniz : ");
    }
   
    System.out.println("EnBuyuk sayi " + enBuyuk + "\nEnkucuk sayi  "+ enKucuk);
	
	
	scan.close();
	}
	

	}
	 
		
		

