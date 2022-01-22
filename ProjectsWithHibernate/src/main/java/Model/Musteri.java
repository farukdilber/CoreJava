package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String isim;
    private String tel;
    private String email;
    private String krediKarti;

    public Musteri() {
    }

    public Musteri(String isim, String tel, String email, String krediKarti) {
        this.isim = isim;
        this.tel = tel;
        this.email = email;
        this.krediKarti = krediKarti;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getKrediKarti() {
        return krediKarti;
    }

    public String setIsim() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim : ");
        this.isim = scan.next();
        return this.isim;
    }

    public String setTel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Telefon : ");
        this.tel = scan.next();
        return this.tel;
    }

    public String setEmail() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Email : ");
        this.email = scan.next();
        return this.email;
    }

    public String setKrediKarti() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kredi Karti No : ");
        this.krediKarti = scan.next();
        return this.krediKarti;
    }

    @Override
    public String toString() {
        return
                "Isim\t: '" + isim + '\'' +
                        "\nTel\t: '" + tel.substring(0, 4) + tel.substring(4).replaceAll("\\w", "*") + '\'' +
                        "\nE-mail\t: '" + email.substring(0, 3) + email.substring(3, email.indexOf("@")).replaceAll("\\w", "*") + email.substring(email.indexOf("@")) + '\'' +
                        "\nKredi Karti\t: '" + krediKarti.substring(0, 4) + krediKarti.substring(4).replaceAll("\\w", "*");
    }
}
