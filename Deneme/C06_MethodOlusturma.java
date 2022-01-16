package Deneme;

import java.util.Scanner;

public class C06_MethodOlusturma {
	public static void main(String[] args) {

		//kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method olusturun
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method 3 yazarsa kupler toplamini yapan 
		//method calissin
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen iki sayi giriniz \n"
			+ "ilkini girince entera basiniz");
	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	
	System.out.println("lutfen yapmak istediginiz islemi seciniz \n"
			+ "1-->karesini alma ve toplama\n"
			+ "2--> sayilarin kupunu alma ve toplama");
	
	int secim=scan.nextInt();
	
	if (secim<1||secim>2) {
		System.out.println("lutfen islemi bir veya iki olarak seciniz");
		return;
	} else if (secim==1){
		karesi(sayi1,sayi2);
	} else if (secim==2) {
		kupu(sayi1,sayi2);
		
	}
		
	} // method sonu

	private static void kupu(double sayi1, double sayi2) {
     System.out.println("sayilarin kupleri toplami : " + (Math.pow(sayi1, 3)+Math.pow(sayi2, 3)));		
	} // kupu method sonu

	private static void karesi(double sayi1, double sayi2) {
		System.out.println("sayilarin karesi toplami : " + (Math.pow(sayi1, 2)+Math.pow(sayi2, 2)));
	} // karesi method sonu

}
