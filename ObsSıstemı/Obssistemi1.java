package ObsSýstemý;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obssistemi1 {
	
	public static void main(String[] args) {
			ArrayList<Ogrenci>array=new ArrayList<Ogrenci>();
			List<Teacher> ogretmenListesi = new ArrayList<>();
			while (true) {
				System.out.println("----Ogrenci Bilgi Sistemine Hosgeldiniz----");
				System.out.println("1.Ogretmen ve brans ekle ");
				System.out.println("2.Ogrenci ve ders adi ve ders notu ekle ");
				System.out.println("3.Ogretmenleri gor ");
				System.out.println("4.Ogrenci durumunu gor ");
				System.out.println("5.Sistemden cikis ");
				Scanner in = new Scanner(System.in);
				String line = in.nextLine();
				switch (line) {
				case "1":
					System.out.println("Ogretmen ve brans ekle");
					ekleOgretmen(ogretmenListesi);
					break;
				case "2":
					System.out.println("Ogrenci ve ders adi ve ders notu ekle");
					ekleOgrenci(array);
					break;
				case "3":
					System.out.println("Ogretmenleri gor");
					ogretmenDurum(ogretmenListesi);
					break;
				case "4":
					System.out.println("Ogrenci durumunu gor");
					ogrenciDurum(array);
					break;
				case "5":
				System.out.println("Sistemden cikis");
				System.exit(0);
				}	
				}
			
			}
			private static void ogretmenDurum(List<Teacher> ogretmenListesi) {
				if (ogretmenListesi.size()==0) {
					System.out.println("Herhangi bir bilgi bulunamadi,lutfen ogrenci ve notu girin!!");
					return;
				}
				System.out.println("OgrenciAd \t\tDersAd \t\tNot");
				for (int i = 0; i < ogretmenListesi.size(); i++) {
					Teacher d = ogretmenListesi.get(i);
				   
					System.out.println(d.getBranch()+"\t  \t"+d.getName());
					
				}
		
	}
			private static void ekleOgretmen(List<Teacher> ogretmenListesi) {
				Scanner in=new Scanner(System.in);
				System.out.println("Ogretmen adi giriniz");
				String name = in.nextLine();
				System.out.println("Ogretmen ders adi giriniz");
				String branch=in.nextLine();
				Teacher d = new Teacher();
				d.setBranch(branch);
				d.setName(name);
				ogretmenListesi.add(d);
				System.out.println("Ogretmen adi ve ders bilgisi eklendi!!!");
	}
			public static void ekleOgrenci(ArrayList<Ogrenci>array) {
				Scanner in=new Scanner(System.in);
				System.out.println("Ogrenci adi giriniz");
				String ogrenciAd = in.nextLine();
				System.out.println("Ogrenci ders adi giriniz");
				String dersAd=in.nextLine();
				System.out.println("Ogrenci notu giriniz");
				int not=in.nextInt();
				Ogrenci s = new Ogrenci();
				s.setDersAd(dersAd);
				s.setOgrenciAd(ogrenciAd);
				s.setNot(not);
//				s.getOgrenciAd();
//				s.getDersAd();
//				s.getNot();
				array.add(s);
				
				System.out.println("Ogrenci adi aldigi ders ve notu eklendi!!!");
				
			}
			public static void ogrenciDurum(ArrayList<Ogrenci>array) {
				if (array.size()==0) {
					System.out.println("Herhangi bir bilgi bulunamadi,lutfen ogrenci ve notu girin!!");
					return;
				}
				System.out.println("OgrenciAd \t\tDersAd \t\tNot");
				for (int i = 0; i < array.size(); i++) {
					Ogrenci s = array.get(i);
				   
					System.out.println(s.getOgrenciAd()+"\t  \t"+s.getDersAd()+"\t\t"+s.getNot());
					
				}
			}
			
			
			
			
			
			
		

	}


