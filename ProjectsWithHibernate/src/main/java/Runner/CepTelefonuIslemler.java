package Runner;

import Model.CepTelefonu;
import RepositoryImpl.cepTelefonuRepositoryImpl;
import RepositoryImpl.musteriRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class CepTelefonuIslemler {

    static int telMarkaSecim = 2;
    cepTelefonuRepositoryImpl ctrI;
    musteriRepositoryImpl musteriRepository;
    static List <CepTelefonu>secilenTelefon;

    public CepTelefonuIslemler() {
    }

    static String[] TelefonMarkalar = {"Samsung", "Apple", "Huawei", "Casper", "Asus", "Xiaomi"};

    void telefonMarkaDondur() {
        System.out.println("Listeden marka seciniz");
        for (int i = 0; i < TelefonMarkalar.length; i++) {
            System.out.println((i + 1) + ". " + TelefonMarkalar[i]);
        }
        Scanner scan = new Scanner(System.in);
        telMarkaSecim = scan.nextInt();
        if (telMarkaSecim >= 1 && telMarkaSecim <= 7) {
            System.out.println("Marka secildi...");
            String marka = TelefonMarkalar[telMarkaSecim - 1];
            secilenTelefon = ctrI.findMarka(marka);
            telefonIslemleri();
        } else telefonMarkaDondur();
    }

    void telefonIslemleri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Urun Ozellikleri\n2.Urun Fiyat Bilgileri\n3.Satin Alma Islemleri\n4.Ana menu");
        int telIslemSecimi = scan.nextInt();
        switch (telIslemSecimi) {
            case 1 -> {
                System.out.println("*************************************");
                System.out.println("Marka : " + secilenTelefon.get(0).getMarka()
                        + "\nModel : " + secilenTelefon.get(0).getUrunAdi());
                System.out.println("*************************************");
                telefonIslemleri();
            }
            case 2 -> {
                System.out.println("*************************************");
                System.out.println("Fiyat : " + secilenTelefon.get(0) + " TL"
                        + "\nIndirim Orani : %" + secilenTelefon.get(0).getIndirimOrani()
                        + "\nIndirimli Fiyat : " + (secilenTelefon.get(0).getFiyat() - (((double) secilenTelefon.get(0).getIndirimOrani() / 100)
                        * secilenTelefon.get(0).getFiyat())) + " TL"
                        + "\nStok Durumu : " + secilenTelefon.get(0).setStokMiktari());
                System.out.println("*************************************");
                telefonIslemleri();
            }
            case 3 -> {
                System.out.println("*************************************");
                if (secilenTelefon.get(0).getStokMiktari().equalsIgnoreCase("Stokta mevcut")) {
                    musteriRepository.save();
                    System.out.println("*************************************");
                    satinAlma();
                    System.exit(0);
                } else {
                    System.out.println("*************************************");
                    System.out.println("Urun stokta olmadigindan satin alma islemi gerceklestirilemiyor...");
                    telefonIslemleri();
                }
            }
            case 4 -> {
                System.out.println("*************************************");
                System.out.println("Ana menuye yonlendiriliyorsunuz...");
                //Runner.ekran();
            }
        }
    }

    void satinAlma() {
        System.out.println("Sepete eklediginiz urunu satin almak icin 1'e islemi iptal etmek icin 0'a basiniz");
        Scanner scan = new Scanner(System.in);
        int islemSecimi = scan.nextInt();
        switch (islemSecimi) {
            case 1 -> System.out.println("Satin alma islemi basariyla gerceklesti. Iyi gunlerde kullanin\n*********Fatura Bilgileriniz*********" +
                    "\n-------------------------------"
                    + "\nMusteri Bilgiler : \n" + musteriRepository.find() +
                    "\n-------------------------------"
                    + "\nUrun Bilgileri : \n" + secilenTelefon.toString() +
                    "\n\n----------SURPRIZZZZ----------" +
                    "\nSirketimiz yaptiginiz alisveristen dolayi size kucuk bir hediye vermek istiyor. Hediyeniz : " + hediyeUrun());
            case 0 -> {
                System.out.println("Ana menuye yonlendiriliyorsunuz...");
                Main.ekran();
            }
            default -> {
                System.out.println("Lutfen gecerli sayi girin");
                satinAlma();
            }
        }
    }
    String hediyeUrun(){
        String [] hediyeUrunler = {"Kulaklik", "100 TL Hediye Ceki", "Akilli Saat", "PS Oyunu", "Sarj Adaptoru", "Tiras Makinesi"};
        int random = (int)(Math.random()*5);
        return hediyeUrunler[random];
    }
}
