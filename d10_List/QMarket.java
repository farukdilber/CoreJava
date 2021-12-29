package d10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
	/*
     * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program yaz�n�z.
     * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
     * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
     *
     * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)
     * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
     * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.
     * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n.
     * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
     * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun.
     * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
     * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.
     * */


	static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. ad�m
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. ad�m
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. ad�m
            System.out.print(gunler.get(gun) + " g�n�n�n kazanc�n� giriniz : ");//gunler listinden ald���m g�n i�in kullan��cdan o g�n�n has�lat�n� istedim.
            double gunlukhasilat = sc.nextDouble();//istedi�im has�lat� gunluk has�lata atad�m
            gunlukKazanclar.add(gunlukhasilat);//ald���m g�nl�k has�lat� gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//ald���m g�nl�k has�lat� kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .g�nleri �a��rd�m.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancG�nleri();
        getOrtalamaninAltindaKazancG�nleri();

        System.out.println("g�nl�kkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazan� : " + getOrtalamaKazanc());
        System.out.println("ortalaman�n �st�ndeki g�n : " + getOrtalamaninUstundeKazancG�nleri());
        System.out.println("ortalaman�n alt�ndaki g�n : " + getOrtalamaninAltindaKazancG�nleri());
    }

    private static String getOrtalamaninAltindaKazancG�nleri() {//6. ad�m
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancG�nleri() {//5.ad�m
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. ad�m
        double ortalama = ciro / 7;
        return ortalama;
    }
}