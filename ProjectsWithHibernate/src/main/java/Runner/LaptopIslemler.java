package Runner;

import java.util.List;
import java.util.Scanner;

public class LaptopIslemler {

    static int laptopMarkaSecim;
    RepositoryImpl.laptopRepositoryImpl laptopRepository;
    RepositoryImpl.musteriRepositoryImpl musteriRepository;
    static List<Model.Laptop> secilenLaptop;

    public LaptopIslemler() {
    }

    static String[] LaptopMarkalar = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Monster"};


    void laptopMarkaDondur() {
        System.out.println("Listeden marka seciniz");
        for (int i = 0; i < LaptopMarkalar.length; i++) {
            System.out.println((i + 1) + ". " + LaptopMarkalar[i]);
        }
        Scanner scan = new Scanner(System.in);
        laptopMarkaSecim = scan.nextInt();
        if (laptopMarkaSecim >= 1 && laptopMarkaSecim <= 7) {
          secilenLaptop = laptopRepository.findMarka(LaptopMarkalar[laptopMarkaSecim-1]);
            laptopIslemleri();
        } else laptopMarkaDondur();
    }

    void laptopIslemleri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Urun Ozellikleri\n2.Urun Fiyat Bilgileri\n3.Satin Alma Islemleri\n4.Ana menu");
        int telIslemSecimi = scan.nextInt();
        switch (telIslemSecimi) {
            case 1 -> {
                System.out.println("*************************************");
                System.out.println("Marka : " + secilenLaptop.get(0).getMarka()
                        + "\nModel : " + secilenLaptop.get(0).getUrunAdi());
                System.out.println("*************************************");
                laptopIslemleri();
            }
            case 2 -> {
                System.out.println("*************************************");
                System.out.println("Fiyat : " + secilenLaptop.get(0).getFiyat() + " TL"
                        + "\nIndirim Orani : %" + secilenLaptop.get(0).getIndirimOrani()
                        + "\nIndirimli Fiyat : " + (secilenLaptop.get(0).getFiyat() -
                        (((double) secilenLaptop.get(0).getIndirimOrani() / 100)
                                * secilenLaptop.get(0).getFiyat())) + " TL"
                        + "\nStok Durumu : " + secilenLaptop.get(0).setStokMiktari().toString());
                System.out.println("*************************************");
                laptopIslemleri();
            }
            case 3 -> {
                System.out.println("*************************************");

                if (secilenLaptop.get(0).getStokMiktari().equalsIgnoreCase("Stokta mevcut")) {
                    musteriRepository.save();
                    System.out.println("*************************************");
                    satinAlma();
                    System.exit(0);
                } else {
                    System.out.println("*************************************");
                    System.out.println("Urun stokta olmadigindan satin alma islemi gerceklestirilemiyor...");
                    laptopIslemleri();
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
                    "\n------------------------------"
                    + "\nUrun Bilgileri : \n" + secilenLaptop.toString()+
                    "\n\n----------SURPRIZZZZ----------" );
                   // "\nSirketimiz yaptiginiz alisveristen dolayi size kucuk bir hediye vermek istiyor. Hediyeniz : "+ hediyeUrun());
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
