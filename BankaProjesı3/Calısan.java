package BankaProjesý3;

import java.util.Scanner;

public class Calýsan extends Personel{
	Data dc = new Data();

    public Calýsan() {
	}

    public Calýsan(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
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
        System.out.print("Müþteri isim ve soyisim giriniz : ");
        String isim = scan.nextLine();
        System.out.print("Müþteri hesap numarasý giriniz : ");
        String hesapno = scan.next();
        System.out.print("Müþteri þifresi giriniz : ");
        String sifre = scan.nextLine();
        scan.next();
        System.out.print("Müþteri baþlangýç bakiyesi giriniz : ");
        double baslangicBakiye = scan.nextDouble();
        Musteri a = new Musteri(isim, hesapno, sifre, baslangicBakiye);
        dc.setmusteriListesi(dc.getmusteriListesi()).add(a);
        System.out.println("Musteri bilgileri basari ile eklendi");

    }
}
