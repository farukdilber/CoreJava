package BankaProjesý3;

import java.util.Scanner;

public class Musteri {
	String isim;
    String hesapno;
    String sifre;
    private double bakiye;

    public double getBakiye() {
        return bakiye;
    }

    public double setBakiye(double bakiye) {
        this.bakiye = bakiye;
        return this.bakiye;
    }

    public Musteri() {
    }

    public Musteri(String isim, String hesapno, String sifre, double bakiye) {
        this.isim = isim;
        this.hesapno = hesapno;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    double paraYatir() {
        Musteri m2 = new Musteri();
        Data d2 = new Data();
        d2.getmusteriListesi();

        Scanner scan = new Scanner(System.in);
        System.out.println("Yatýrmak isteiðiniz tutarý giriniz : ");
        double tutar = scan.nextDouble();
       m2.bakiye += tutar;
        return m2.bakiye;
    }

    double paraCek() {
        Data d2 = new Data();
        d2.getmusteriListesi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Çekmek isteiðiniz tutarý giriniz : ");
        double tutar = scan.nextDouble();
        if (tutar > this.bakiye) {
            System.out.println("Yeterli bakiyeniz bulunmamaktadýr");
        } else {
            this.bakiye -= tutar;
        }
        return this.bakiye;
    }

    void bakiyeGoruntule() {
        System.out.println("Mevcut bakiyeniz : " + this.bakiye);

    }

    void musteriBilgileriGoruntule() {

        Data d2 = new Data();
        d2.getmusteriListesi();
        Scanner scan = new Scanner(System.in);
        System.out.println("Görmek istediðiniz müþterinin ismini giriniz : ");
        String isim = scan.nextLine();
        for (Musteri m2 : d2.getmusteriListesi()) {
            if (m2.isim.equalsIgnoreCase(isim)) {
                System.out.println("\n*******Müþteri Bilgileri *********");
                System.out.println("Müþteri ad-soyadý\t:\t" + m2.isim + "\nMüþteri Hesap No\t:\t"
                        + m2.hesapno + "\nMüþteri baþlangýç bakiyesi\t:\t" + m2.bakiye + " TL");
            } else {
                System.out.println("Girdiðiniz isimde müþteri bulunmuyor");
            }
        }
    }
}
