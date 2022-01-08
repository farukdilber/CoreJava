package BankaProjesi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Data extends Yonetici {
	String sifre;
	public static List<Musteri> musteriListesi = new ArrayList<>();
       public <Data>List<Musteri> getmusteriListesi(){
		return musteriListesi;
		}
public Data() {
	
}
	
	
	
	
public void setmusteriListesi(List<Musteri> musteriListesi) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Musteri isim ve soyisim ardindan musteri no giriniz");
	String isim = scan.next();
	String soyisim = scan.next();
	String hesapno = scan.next();
	Musteri a = new Musteri(isim,soyisim,hesapno);
	musteriListesi.add(a);
	System.out.println("Musteri bilgileri basari ile eklendi");
	this.musteriListesi=musteriListesi;
	
	
}
//public Data(String sifre) {
//	this.sifre=sifre;
//}
public void ekranCiktisi() {
	Yonetici b1 = new Yonetici();
	Calisan c1 = new Calisan();
	Musteri m1 = new Musteri();

	int ch;
    do {
        System.out.println("Main Menu\n 1. Yonetici Girisi\n 2. Calisan Girisi\n 3. Musteri Girisi\n 4.Cikis ");
        Scanner KB = new Scanner(System.in);   
        System.out.println("Seciminiz :"); ch = KB.nextInt();
      
       
        
	

            switch (ch) 
            {
                case 1: System.out.println("Yonetici sifrenizi giriniz"); 
                String sifre = KB.next();
                Yonetici sif = new Data();
                 
               if (sif.sifre.equals(sifre)) {
            	     System.out.println("Sifre dovvu samet devam edin");
			} else {
				System.out.println("Sifre yanlis usta sistem kapandi");
				System.exit(0);
			} 
              
                
                	System.out.println("\n1.Calisan isten cikarma  ");
                    System.out.println("2. Calisan ise alma");
                    System.out.println("3. Musteri bilgileri goruntule");
                    System.out.println("4. Sistemi kapat");
                    ch= KB.nextInt();
                    switch (ch) {
					case 1:
						
						break;
					case 2:
						
                        break;
					case 3:
						
						break;
					case 4:
						System.out.println("Sistem kapaniyor...");
						System.exit(0);			
						break;
					}
                        break;
                
                
                
                case 2:System.out.println("Calisan sifrenizi giriniz"); 
                String sifre1 = KB.next();
                Calisan sif1 = new Calisan();
                 
               if (sif1.sifre.equals(sifre1)) {
            	     System.out.println("Sifre dovvu samet devam edin");
			} else {
				System.out.println("Sifre yanlis usta sistem kapandi");
				System.exit(0);
			} 
                	System.out.println("\n1.Musteri ekle  ");
                    System.out.println("2. Sistemi kapat");
                    ch= KB.nextInt();
                    switch (ch) {
					case 1:
						c1.setMusteriListesi();
						break;
					case 2:
						System.out.println("Sistem kapaniyor...");
						System.exit(0);			
						break;
					}

                    break;
                        
                    
/*                        if (!bul) {
                        System.out.println("Arama basarisiz..Hesap bulunamadi..");
                   }
                    break;
*/
                case 3:
                	 System.out.println("Main Menu\n 1. Sifre olustur\n 2. Hesap ara\n 3. Para Yatir\n 4. Para Cek\n 5.Cikis ");
                    ch= KB.nextInt();
                    switch (ch) {
					case 1:
						
						break;
					case 2:
						
                        break;
					case 3:
						
						break;
					case 4:
						System.out.println("Sistem kapaniyor...");
						System.exit(0);			
						break;
					case 5:
						System.out.println("Sistem kapaniyor...");
						System.exit(0);			
						break;
					}
//                    for (int i = 0; i < C.length; i++) {
//                        C[i].hesapGoster();
//                    }
                    break;
                        }
                    
//                    if (!bul) {
//                        System.out.println("Arama basarisiz..Hesap bulunamadi..");
//                    }
//                    break;
            
    }
                    while (ch != 4);

}
}

