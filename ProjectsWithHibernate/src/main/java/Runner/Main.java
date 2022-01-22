package Runner;

import RepositoryImpl.cepTelefonuRepositoryImpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
static CepTelefonuIslemler cepTelefonuIslemler =new CepTelefonuIslemler();
static LaptopIslemler laptopIslemler = new LaptopIslemler();
    public static void main(String[] args) {

        ekran();

    }
   static void ekran() {
       // try {
            System.out.println("****************Patika Store Urun Yonetim Paneline Hosgeldiniz***************");
            Scanner scan = new Scanner(System.in);
            System.out.println("Listeden secim yapiniz");
            System.out.println("1.Cep telefonu\n2.Laptop\n3.Markalari gor\n4.Cikis");
            int menuSecim = scan.nextInt();
            switch (menuSecim) {
                case 1 -> {
                    cepTelefonuIslemler.telefonMarkaDondur();
                    ekran();
                }
                case 2 -> {
                    laptopIslemler.laptopMarkaDondur();
                    ekran();
                }
                case 3 -> {
                    markalariGoster();
                    ekran();
                }
                case 4 -> System.out.println("Yine bekleriz...");
                default -> {
                    System.out.println("Lutfen listeden secim yapiniz");
                    ekran();
                }
            }
      /*  } catch (Exception e) {
            System.out.println("Yanlis deger girdiniz ! Ana menuye yonlendiriliyorsunuz...");
            ekran();
        }

       */
    }

    static void markalariGoster() {
        Set markalariGoster = new TreeSet();
        markalariGoster.addAll(List.of(LaptopIslemler.LaptopMarkalar));
        markalariGoster.addAll(List.of(CepTelefonuIslemler.TelefonMarkalar));

        for (Object o : markalariGoster) {
            System.out.println(o);
        }
    }
}
