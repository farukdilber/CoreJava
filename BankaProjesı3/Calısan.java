package BankaProjes�3;

import java.util.Scanner;

public class Cal�san extends Personel{
	Data dc = new Data();

    public Cal�san() {
	}

    public Cal�san(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
        super.name = name;
        super.departman = departman;
        super.price = price;
        super.workHours = workHours;
        super.kidem = kidem;
        super.setSystemUserName(systemUserName);
        super.setSystemPassword(systemPassword);
    }
    public void  musteriEkle(){

        Scanner scan = new Scanner(System.in);
        System.out.print("M��teri isim ve soyisim giriniz : ");
        String isim = scan.nextLine();
        System.out.print("M��teri hesap numaras� giriniz : ");
        String hesapno = scan.next();
        System.out.print("M��teri �ifresi giriniz : ");
        String sifre = scan.nextLine();
        scan.next();
        System.out.print("M��teri ba�lang�� bakiyesi giriniz : ");
        double baslangicBakiye = scan.nextDouble();
        Musteri a = new Musteri(isim, hesapno, sifre, baslangicBakiye);
        dc.setmusteriListesi(dc.getmusteriListesi()).add(a);
        System.out.println("Musteri bilgileri basari ile eklendi");

    }
}
