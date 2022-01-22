package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Scanner;

@Entity
@Table(name="laptoplar")
public class Laptop {

    @Id
    private int id;
    private double fiyat;
    private int indirimOrani;
    @Transient
    private String stokMiktari;
    private String urunAdi;
    private String marka;
    private String hafizaBilgisi;
    private String ekranBoyutu;
    private String pilGucu;
    private String ram;
    private String renk;

    public Laptop() {
    }

    public Laptop( double fiyat, int indirimOrani, String urunAdi, String marka, String hafizaBilgisi, String ekranBoyutu, String pilGucu, String ram, String renk) {
        this.fiyat = fiyat;
        this.indirimOrani = indirimOrani;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafizaBilgisi = hafizaBilgisi;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public double getFiyat() {
        return fiyat;
    }

    public double setFiyat() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fiyat : ");
        this.fiyat = scan.nextDouble();
        return this.fiyat;
    }

    public int getIndirimOrani() {
        return indirimOrani;
    }

    public int setIndirimOrani() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Indirim Orani : ");
        this.indirimOrani = scan.nextInt();
        return this.indirimOrani;
    }

    public String getStokMiktari() {
        return stokMiktari;
    }

    public String setStokMiktari() {
        int random = (int) (Math.random() * 10);
        String stokMiktari = random > 3 ? "Stokta mevcut" : "Stokta mevcut degil";
        this.stokMiktari = stokMiktari;
        return stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String setUrunAdi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim : ");
        this.urunAdi = scan.next();
        return this.urunAdi;
    }

    public String getMarka() {
        return marka;
    }

    public String setMarka() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Marka : ");
        this.marka = scan.next();
        return this.marka;
    }

    public String getHafizaBilgisi() {
        return hafizaBilgisi;
    }

    public String setHafizaBilgisi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hafiza : ");
        this.hafizaBilgisi = scan.next();
        return this.hafizaBilgisi;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public String setEkranBoyutu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ekran Boyutu : ");
        this.ekranBoyutu = scan.next();
        return this.ekranBoyutu;
    }

    public String getPilGucu() {
        return pilGucu;
    }

    public String setPilGucu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pil : ");
        this.pilGucu = scan.next();
        return this.pilGucu;
    }

    public String getRam() {
        return ram;
    }

    public String setRam() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ram : ");
        this.ram = scan.next();
        return this.ram;
    }

    public String getRenk() {
        return renk;
    }

    public String setRenk() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Renk : ");
        this.renk = scan.next();
        return this.renk;
    }



    @Override
    public String toString() {
        return
                "Fiyat : " + fiyat +
                ", Indirim Orani : %" + indirimOrani +
                ", Model : '" + urunAdi + '\'' +
                ", Marka : '" + marka + '\'' +
                "\nHafiza Bilgisi : '" + hafizaBilgisi + '\'' +
                ", Ekran Boyutu : '" + ekranBoyutu + '\'' +
                ", Pil Gucu : '" + pilGucu + '\'' +
                ", RAM : '" + ram + '\'' +
                ", Renk : '" + renk;
    }
}
