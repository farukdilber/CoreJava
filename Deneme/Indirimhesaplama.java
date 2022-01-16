package Deneme;
import java.util.Scanner;

public class Indirimhesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     * SORU 1
	     * 
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     * 
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		Scanner scan = new Scanner(System.in);
		System.out.print("\nAldiginiz urun adedini girin : " );
		int quantity1 =scan.nextInt();
		System.out.print("\nUrunun liste fiyatini girin :");
		double listPrice =scan.nextDouble() ;
		double total = quantity1 * listPrice ;
		System.out.println("indirimsiz fiyat : " + total);
		
		if (quantity1>10 && quantity1<20) {
			System.out.println("indirimli odeyeceginiz miktar :" + "" + (total-(total*2/10)));
		}
		if (quantity1>20 && quantity1<50) {
			System.out.println("indirimli odeyeceginiz miktar :" + "" + (total-(total*3/10)));	
		}
		if (quantity1<10) {
			System.out.println("Indirminiz yoktur ; " + total);
		}
		System.out.println("Kazandiginiz indirim : " + (total-(total-(total*3/10))));
	}

}
