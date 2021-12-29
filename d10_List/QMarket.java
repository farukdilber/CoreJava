package d10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
	/*
     * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
     * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
     * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
     *
     * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)
     * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
     * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.
     * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn.
     * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
     * 			 ortalama kazançtan aþaðýysa o günleri return yap.
     * */


	static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adým
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adým
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adým
            System.out.print(gunler.get(gun) + " gününün kazancýný giriniz : ");//gunler listinden aldýðým gün için kullanýýcdan o günün hasýlatýný istedim.
            double gunlukhasilat = sc.nextDouble();//istediðim hasýlatý gunluk hasýlata atadým
            gunlukKazanclar.add(gunlukhasilat);//aldýðým günlük hasýlatý gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldýðým günlük hasýlatý kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .günleri çaðýrdým.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();

        System.out.println("günlükkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazanç : " + getOrtalamaKazanc());
        System.out.println("ortalamanýn üstündeki gün : " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalamanýn altýndaki gün : " + getOrtalamaninAltindaKazancGünleri());
    }

    private static String getOrtalamaninAltindaKazancGünleri() {//6. adým
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() {//5.adým
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. adým
        double ortalama = ciro / 7;
        return ortalama;
    }
}