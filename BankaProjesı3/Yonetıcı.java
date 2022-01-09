package BankaProjes�3;

import java.util.Scanner;

public class Yonet�c� extends Personel {
	Data dy = new Data();

    public Yonet�c�() {

    }

    public Yonet�c�(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
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
        System.out.println("��karmak istedi�iniz �al��an isimi giriniz");
        String isim = scan.nextLine();

        for (Cal�san c : dy.getCalisanListesi()) {
            if (dy.getCalisanListesi().equals(isim)) {
                dy.setCalisanListesi(dy.getCalisanListesi()).remove(c);
            }
        }
    }

    public void iseAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("�al��an isim ve soyisim giriniz");
        String name = scan.nextLine();
        System.out.println("�al��an departman giriniz");
        String departman = scan.nextLine();
        System.out.println("�al��an maa� giriniz");
        double price = scan.nextDouble();
        System.out.println("�al��an haftal�k �al��ma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("�al��an k�dem giriniz");
        int kidem = scan.nextInt();
        System.out.println("�al��an sistemi kullan�c� ad� giriniz");
        String systemUserName = scan.nextLine();
        System.out.println("�al��an sistemi �ifresi giriniz");
        String systemPassword = scan.nextLine();
        Cal�san c = new Cal�san(name, departman, price, workHours, kidem, systemUserName, systemPassword);
        dy.setCalisanListesi(dy.getCalisanListesi()).add(c);
        System.out.println("�al��an bilgileri basari ile eklendi");
    }
}
