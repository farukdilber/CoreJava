package day03_Scanner;

public class C03_SwapVariables2 {
	public static void main(String[] args) {
		int sayi1=15;
		int sayi2=20;
	System.out.println("Baslangicta sayi1 " + sayi1 + "\nBaslangicta sayi2 :" + sayi2);
	sayi1=sayi1-sayi2;
	sayi2=sayi1+sayi2;
	sayi1=sayi2-sayi1;
	
	System.out.println("Sonucta sayi1 " + sayi2 + "\nSonucta sayi2 :" + sayi2);
				
		
		
}
}