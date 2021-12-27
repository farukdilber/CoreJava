package d08_While_DoWhile;

import java.util.Scanner;

public class Q13 {
	 public static void main(String[] args) {
	        /*
	         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	         * musteri karti olup olmadigini sorun
	         *
	         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
	         * indirim yapin
	         */
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Lütfen kaç adet ürün aldýðýnýzý giriniz: ");
	        int alýnanUrunSayýsý = scan.nextInt();
	        int toplam = 0;
	        int urunFiyatý = 0;
	        int i = 1;
	        while (i <= alýnanUrunSayýsý) {
	            System.out.println("Lütfen aldýðýnýz " + i + ". ürünün fiyatýný giriniz: ");
	            urunFiyatý = scan.nextInt();
	            i++;
	            toplam += urunFiyatý;
	        }
	        System.out.println("Müþteri kartýnýz var mý? \n\n 'EVET' ya da 'HAYIR'");
	        char musteriKartý = scan.next().toUpperCase().charAt(0);
	        if (musteriKartý == 'E') {
	            if (alýnanUrunSayýsý >= 10) {
	                System.out.println(
	                        "\nMüþteri kartýnýz olduðu için alýþveriþinize %15 indirim uygulanmýþtýr. Ek olarak 10'dan fazla ürün aldýðýnýz için bu indirim %20'ye yükseltilmiþtir. "
	                                + "\n%20 indirim sonrasý ödemeniz gereken tutar: " + (toplam - toplam * 20 / 100)
	                                + " TL");
	            } else {
	                System.out.println(
	                        "\nMüþteri kartýnýz olduðu için alýþveriþinize %15 indirim uygulanmýþtýr. \n%15 indirim sonrasý ödemeniz gereken tutar: "
	                                + (toplam - toplam * 15 / 100) + " TL");
	            }
	        } else if (musteriKartý == 'H') {
	            if (alýnanUrunSayýsý >= 10) {
	                System.out.println("\\n10'dan fazla ürün aldýðýnýz için alýþveriþinize %15 indirim uygulanmýþtýr. "
	                        + "\n%15 indirim sonrasý ödemeniz gereken tutar: " + (toplam - toplam * 15 / 100) + " TL");
	            } else {
	                System.out
	                        .println("\\nBugüne özel %10 indirim kazandýnýz. \n%10 indirim sonrasý ödemeniz gereken tutar: "
	                                + (toplam - toplam * 10 / 100) + " TL");
	            }
	        }
	    }
}
