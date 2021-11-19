package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sayi1=10;
       int sayi2=20;
       
       System.out.println("Baslangicta sayi1 : " + sayi1 +"ve sayi2 :" + sayi2);
       int bos ;
       bos=sayi2;
       sayi2=sayi1;
       sayi1=bos;
       System.out.println("Sonucta sayi1 : " + sayi1 +"ve sayi2 :" + sayi2);
	}

}
