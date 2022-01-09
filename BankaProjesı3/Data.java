package BankaProjes�3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data extends Personel {
	 private static List<Musteri> musteriListesi = new ArrayList<>();
		private static List<Yonet�c�> yoneticiListesi = new ArrayList<>();
		private static  List<Cal�san> calisanListesi = new ArrayList<>();

		public Data() {
		}

		public List<Yonet�c�> getYoneticiListesi() {
			return yoneticiListesi;
		}

		public void setYoneticiListesi(List<Yonet�c�> yoneticiListesi) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Y�netici isim ve soyisim giriniz");
			String name = scan.nextLine();
			System.out.println("Y�netici departman giriniz");
			String departman = scan.nextLine();
			System.out.println("Y�netici maa� giriniz");
			double price = scan.nextDouble();
			System.out.println("Y�netici haftal�k �al��ma saati giriniz");
			int workHours = scan.nextInt();
			System.out.println("Y�netici k�dem giriniz");
			int kidem = scan.nextInt();
			System.out.println("Y�netici sistemi kullan�c� ad� giriniz");
			String systemUserName = scan.nextLine();
			scan.next();
			System.out.println("Y�netici sistemi �ifresi giriniz");
			String systemPassword = scan.nextLine();
			scan.next();
			Yonet�c� y = new Yonet�c�(name, departman, price, workHours, kidem, systemUserName, systemPassword);
			yoneticiListesi.add(y);
			System.out.println("Y�netici bilgileri basari ile eklendi");

			this.yoneticiListesi = yoneticiListesi;
		}

		public List<Cal�san> getCalisanListesi() {
			return calisanListesi;
		}

		public List<Cal�san> setCalisanListesi(List<Cal�san> calisanListesi) {

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
	        Yonet�c� y1 = new Yonet�c�();
	        Cal�san c1 = new Cal�san();
	        Musteri m1 = new Musteri();
	        Data d1 = new Data();

	        int x = 1;
	        while (x != 0) {
	            System.out.println("Main Menu\n 1. Yonetici Girisi\n 2. Calisan Girisi\n 3. Musteri Girisi\n 0.Cikis ");
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Se�iminiz :");
	            String a = scan.nextLine();
	            int a1 = Integer.parseInt(a);
	            if (a1 == 0) {
	                System.out.println("��k�� yap�l�yor.");
	                break;
	            }

	            switch (a1) {

	                case 1:
	                    System.out.println("Yeni y�netici profili olu�turmak i�in 1'e \nvar olan kullan�c� ad� ve �ifrenizle giri� yapmak i�in 2'ye bas�n�z");
	                    String b = scan.nextLine();
	                    int b1 = Integer.parseInt(b);
	                    switch (b1) {
	                        case 1:
	                            d1.setYoneticiListesi(d1.getYoneticiListesi());
	                            break;
	                        case 2:
	                            System.out.println("Kullan�c� ad�n�z� giriniz : ");
	                            String user1 = scan.next();
	                            System.out.println("Parolan�z� giriniz : ");
	                            String parola1 = scan.next();
	                            

	                            for (Yonet�c� y2 : d1.getYoneticiListesi()) {
	                                if ((y2.getSystemUserName().equalsIgnoreCase(user1)) && (y2.getSystemPassword().equalsIgnoreCase(parola1))) {
	                                    System.out.println("Giri� Ba�ar�l�. L�tfen a�a��dan yapmak istedi�iniz i�lemi  se�iniz");
	                                    System.out.println("\n1.Calisan isten cikarma  ");
	                                    System.out.println("2. Calisan ise alma");
	                                    System.out.println("3. Musteri bilgileri goruntule");
	                                    System.out.println("4. Ana Men�");
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
	                                            System.out.println("Ana men�ye d�n�l�yor...");
	                                            System.exit(0);
	                                            break;
	                                    }
	                                } else {
	                                    System.out.println("Giri� ba�ar�s�z.");
	                                    break;
	                                }
	                                break;
	                            }
	                            break;
	                    }

	                case 2:
	                    System.out.println("Yeni �al��an profili olu�turmak i�in 1'e \nKullan�c� ad� ve �ifrenizle giri� yapmak i�in 2'ye bas�n�z");
	                    String d = scan.nextLine();
	                    int d2 = Integer.parseInt(d);

	                    switch (d2) {
	                        case 1:
	                            d1.setCalisanListesi(d1.getCalisanListesi());
	                            break;
	                        case 2:
	                            System.out.println("Kullan�c� ad�n�z� giriniz : ");
	                            String user2 = scan.next();
	                            System.out.println("Parolan�z� giriniz : ");
	                            String parola2 = scan.next();

	                            for (Cal�san c2 : d1.getCalisanListesi()) {
	                                if ((c2.getSystemUserName().equalsIgnoreCase(user2)) && (c2.getSystemPassword().equalsIgnoreCase(parola2))) {
	                                    System.out.println("Giri� Ba�ar�l�. L�tfen a�a��dan yapmak istedi�iniz i�lemi  se�iniz");
	                                    System.out.println("\n1.Musteri ekle  ");
	                                    System.out.println("2. Ana Men�");
	                                    scan.next();
	                                    int a4 = scan.nextInt();
	                                    switch (a4) {
	                                        case 1:
	                                            c1.musteriEkle();
	                                        case 2:
	                                            System.out.println("Ana men�ye d�n�l�yor...");
	                                            System.exit(2);
	                                            break;
	                                    }
	                                } else {
	                                    System.out.println("Giri� ba�ar�s�z.");
	                                    break;
	                                }
	                            }
	                            break;
	                    }
	                case 3:
	                    System.out.println("Hesap numaran�z� giriniz : ");
	                    String hesNo = scan.nextLine();
	                    System.out.println("Parolan�z� giriniz : ");
	                    String parola3 = scan.nextLine();

	                    for (Musteri m2 : d1.getmusteriListesi()) {
	                        if ((m2.hesapno.equalsIgnoreCase(hesNo)) && (m2.sifre.equalsIgnoreCase(parola3))) {
	                            System.out.println("Giri� Ba�ar�l�. L�tfen a�a��dan yapmak istedi�iniz i�lemi  se�iniz");
	                            System.out.println("Main Menu\n 1. Bakiye G�r�nt�le\n 2. Para Yatir\n 3. Para Cek\n 4.Cikis ");
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
	                                    System.out.println("Ana men�ye d�n�l�yor...");
	                                    System.exit(4);
	                                    break;
	                            }
	                        } else {
	                            System.out.println("Giri� ba�ar�s�z.");
	                            break;
	                        }
	                    }
	                    break;
	            }
	        }
	    }
}
