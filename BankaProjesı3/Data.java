package BankaProjesý3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data extends Personel {
	 private static List<Musteri> musteriListesi = new ArrayList<>();
		private static List<Yonetýcý> yoneticiListesi = new ArrayList<>();
		private static  List<Calýsan> calisanListesi = new ArrayList<>();

		public Data() {
		}

		public List<Yonetýcý> getYoneticiListesi() {
			return yoneticiListesi;
		}

		public void setYoneticiListesi(List<Yonetýcý> yoneticiListesi) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Yönetici isim ve soyisim giriniz");
			String name = scan.nextLine();
			System.out.println("Yönetici departman giriniz");
			String departman = scan.nextLine();
			System.out.println("Yönetici maaþ giriniz");
			double price = scan.nextDouble();
			System.out.println("Yönetici haftalýk çalýþma saati giriniz");
			int workHours = scan.nextInt();
			System.out.println("Yönetici kýdem giriniz");
			int kidem = scan.nextInt();
			System.out.println("Yönetici sistemi kullanýcý adý giriniz");
			String systemUserName = scan.nextLine();
			scan.next();
			System.out.println("Yönetici sistemi þifresi giriniz");
			String systemPassword = scan.nextLine();
			scan.next();
			Yonetýcý y = new Yonetýcý(name, departman, price, workHours, kidem, systemUserName, systemPassword);
			yoneticiListesi.add(y);
			System.out.println("Yönetici bilgileri basari ile eklendi");

			this.yoneticiListesi = yoneticiListesi;
		}

		public List<Calýsan> getCalisanListesi() {
			return calisanListesi;
		}

		public List<Calýsan> setCalisanListesi(List<Calýsan> calisanListesi) {

			this.calisanListesi = calisanListesi;

			return calisanListesi;
		}

	    public List<Musteri> getmusteriListesi() {
	        return musteriListesi;
	    }

	    public List<Musteri> setmusteriListesi(List<Musteri> musteriListesi) {

	        this.musteriListesi = musteriListesi;
			return musteriListesi;
	    }
	    public void ekranCiktisi() {
	        Yonetýcý y1 = new Yonetýcý();
	        Calýsan c1 = new Calýsan();
	        Musteri m1 = new Musteri();
	        Data d1 = new Data();

	        int x = 1;
	        while (x != 0) {
	            System.out.println("Main Menu\n 1. Yonetici Girisi\n 2. Calisan Girisi\n 3. Musteri Girisi\n 0.Cikis ");
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Seçiminiz :");
	            String a = scan.nextLine();
	            int a1 = Integer.parseInt(a);
	            if (a1 == 0) {
	                System.out.println("Çýkýþ yapýlýyor.");
	                break;
	            }

	            switch (a1) {

	                case 1:
	                    System.out.println("Yeni yönetici profili oluþturmak için 1'e \nvar olan kullanýcý adý ve þifrenizle giriþ yapmak için 2'ye basýnýz");
	                    String b = scan.nextLine();
	                    int b1 = Integer.parseInt(b);
	                    switch (b1) {
	                        case 1:
	                            d1.setYoneticiListesi(d1.getYoneticiListesi());
	                            break;
	                        case 2:
	                            System.out.println("Kullanýcý adýnýzý giriniz : ");
	                            String user1 = scan.next();
	                            System.out.println("Parolanýzý giriniz : ");
	                            String parola1 = scan.next();
	                            

	                            for (Yonetýcý y2 : d1.getYoneticiListesi()) {
	                                if ((y2.getSystemUserName().equalsIgnoreCase(user1)) && (y2.getSystemPassword().equalsIgnoreCase(parola1))) {
	                                    System.out.println("Giriþ Baþarýlý. Lütfen aþaðýdan yapmak istediðiniz iþlemi  seçiniz");
	                                    System.out.println("\n1.Calisan isten cikarma  ");
	                                    System.out.println("2. Calisan ise alma");
	                                    System.out.println("3. Musteri bilgileri goruntule");
	                                    System.out.println("4. Ana Menü");
	                                    scan.next();
	                                    String c = scan.nextLine();
	                                    int c2 = Integer.parseInt(c);
	                                    switch (c2) {
	                                        case 1:
	                                            y1.istenCikarma();
	                                            break;
	                                        case 2:
	                                            y1.iseAlma();
	                                            break;
	                                        case 3:
	                                            m1.musteriBilgileriGoruntule();
	                                            break;
	                                        case 4:
	                                            System.out.println("Ana menüye dönülüyor...");
	                                            System.exit(0);
	                                            break;
	                                    }
	                                } else {
	                                    System.out.println("Giriþ baþarýsýz.");
	                                    break;
	                                }
	                                break;
	                            }
	                            break;
	                    }

	                case 2:
	                    System.out.println("Yeni çalýþan profili oluþturmak için 1'e \nKullanýcý adý ve þifrenizle giriþ yapmak için 2'ye basýnýz");
	                    String d = scan.nextLine();
	                    int d2 = Integer.parseInt(d);

	                    switch (d2) {
	                        case 1:
	                            d1.setCalisanListesi(d1.getCalisanListesi());
	                            break;
	                        case 2:
	                            System.out.println("Kullanýcý adýnýzý giriniz : ");
	                            String user2 = scan.next();
	                            System.out.println("Parolanýzý giriniz : ");
	                            String parola2 = scan.next();

	                            for (Calýsan c2 : d1.getCalisanListesi()) {
	                                if ((c2.getSystemUserName().equalsIgnoreCase(user2)) && (c2.getSystemPassword().equalsIgnoreCase(parola2))) {
	                                    System.out.println("Giriþ Baþarýlý. Lütfen aþaðýdan yapmak istediðiniz iþlemi  seçiniz");
	                                    System.out.println("\n1.Musteri ekle  ");
	                                    System.out.println("2. Ana Menü");
	                                    scan.next();
	                                    int a4 = scan.nextInt();
	                                    switch (a4) {
	                                        case 1:
	                                            c1.musteriEkle();
	                                        case 2:
	                                            System.out.println("Ana menüye dönülüyor...");
	                                            System.exit(2);
	                                            break;
	                                    }
	                                } else {
	                                    System.out.println("Giriþ baþarýsýz.");
	                                    break;
	                                }
	                            }
	                            break;
	                    }
	                case 3:
	                    System.out.println("Hesap numaranýzý giriniz : ");
	                    String hesNo = scan.nextLine();
	                    System.out.println("Parolanýzý giriniz : ");
	                    String parola3 = scan.nextLine();

	                    for (Musteri m2 : d1.getmusteriListesi()) {
	                        if ((m2.hesapno.equalsIgnoreCase(hesNo)) && (m2.sifre.equalsIgnoreCase(parola3))) {
	                            System.out.println("Giriþ Baþarýlý. Lütfen aþaðýdan yapmak istediðiniz iþlemi  seçiniz");
	                            System.out.println("Main Menu\n 1. Bakiye Görüntüle\n 2. Para Yatir\n 3. Para Cek\n 4.Cikis ");
	                            String e = scan.nextLine();
	                            int e1 = Integer.parseInt(e);

	                            switch (e1) {
	                                case 1:
	                                    m2.bakiyeGoruntule();
	                                    break;
	                                case 2:
	                                    System.out.println(m2.paraYatir());
	                                    break;
	                                case 3:
	                                    System.out.println(m2.paraCek());
	                                    break;
	                                case 4:
	                                    System.out.println("Ana menüye dönülüyor...");
	                                    System.exit(4);
	                                    break;
	                            }
	                        } else {
	                            System.out.println("Giriþ baþarýsýz.");
	                            break;
	                        }
	                    }
	                    break;
	            }
	        }
	    }
}
