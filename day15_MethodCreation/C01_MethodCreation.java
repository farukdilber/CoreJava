package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli methor olusturun methodlardan biri girilen
		// ilk harf buyuk digerleri kucuk olacak sekilde birlestirin
		//ikinci methot isim ve soyismin ilk harfleri buyuk harf
		// kalan harfler * olacak sekilde birlestirin
		
		//kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		//ve programin kalan kisminda isim ve soyismi kullacinin istedigi sekilde kullanin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isim ve soyisim giriniz :");
		String isim=scan.next();
		String soyisim=scan.next();
		System.out.println("Isminiz acik sekilde yazilmasini istiyorsaniz 1"+ "\nIlkharf haric gizli yazilmasini istiyorsaniz 2'e basin");
		int tercih=scan.nextInt();
		String birlesmisIsim=null;
		if (tercih==1) {
			birlesmisIsim=acikisim(isim,soyisim);
		} else if(tercih==2){
            birlesmisIsim=isimGizle(isim,soyisim);
		} else {
			System.out.println("Yanlis giris yaptiniz");
		}
scan.close();
	}

	private static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).replaceAll("\\w", "*");
		return isim=" "+soyisim;
	}

	private static String acikisim(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).toLowerCase();
		return isim+" "+soyisim; 
	}

}
