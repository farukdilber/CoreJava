package BankaProjesý3;

import java.util.Scanner;

public class Yonetýcý extends Personel {
	Data dy = new Data();

    public Yonetýcý() {

    }

    public Yonetýcý(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
        super.name = name;
        super.departman = departman;
        super.price = price;
        super.workHours = workHours;
        super.kidem = kidem;
        super.setSystemUserName(systemUserName);
        super.setSystemPassword(systemPassword);
    }

   public void istenCikarma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çýkarmak istediðiniz çalýþan isimi giriniz");
        String isim = scan.nextLine();

        for (Calýsan c : dy.getCalisanListesi()) {
            if (dy.getCalisanListesi().equals(isim)) {
                dy.setCalisanListesi(dy.getCalisanListesi()).remove(c);
            }
        }
    }

    public void iseAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çalýþan isim ve soyisim giriniz");
        String name = scan.nextLine();
        System.out.println("Çalýþan departman giriniz");
        String departman = scan.nextLine();
        System.out.println("Çalýþan maaþ giriniz");
        double price = scan.nextDouble();
        System.out.println("Çalýþan haftalýk çalýþma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("Çalýþan kýdem giriniz");
        int kidem = scan.nextInt();
        System.out.println("Çalýþan sistemi kullanýcý adý giriniz");
        String systemUserName = scan.nextLine();
        System.out.println("Çalýþan sistemi þifresi giriniz");
        String systemPassword = scan.nextLine();
        Calýsan c = new Calýsan(name, departman, price, workHours, kidem, systemUserName, systemPassword);
        dy.setCalisanListesi(dy.getCalisanListesi()).add(c);
        System.out.println("Çalýþan bilgileri basari ile eklendi");
    }
}
