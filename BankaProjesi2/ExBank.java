package BankaProjesi2;

import java.util.Scanner;

public class ExBank {
	 public static void main(String arg[]) {
	        Scanner KB = new Scanner(System.in);

	        
	        System.out.print("Kac adet kullanici eklemek istiyorsunuz : ");
	        int n = KB.nextInt();
	        Bank C[] = new Bank[n];
	        for (int i = 0; i < C.length; i++) {
	            C[i] = new Bank();
	            C[i].hesapAc();
	        }

	        
	        int ch;
	        do {
	            System.out.println("Main Menu\n 1. Kullanici ve bilgileri\n 2. Hesap ara\n 3. Para Yatir\n 4. Para Cek\n 5.Cikis ");
	                System.out.println("Seciminiz :"); ch = KB.nextInt();
	                switch (ch) {
	                    case 1:
	                        for (int i = 0; i < C.length; i++) {
	                            C[i].hesapGoster();
	                        }
	                        break;

	                    case 2:
	                        System.out.print("Aramak istediginiz account no giriniz...: ");
	                        String acn = KB.next();
	                        boolean bul = false;
	                        for (int i = 0; i < C.length; i++) {
	                            bul = C[i].hesapArama(acn);
	                            if (bul) {
	                                break;
	                            }
	                        }
	                        if (!bul) {
	                            System.out.println("Arama basarisiz..Hesap bulunamadi..");
	                        }
	                        break;

	                    case 3:
	                        System.out.print("Account no giriniz : ");
	                        acn = KB.next();
	                        bul = false;
	                        for (int i = 0; i < C.length; i++) {
	                            bul = C[i].hesapArama(acn);
	                            if (bul) {
	                                C[i].yatir();
	                                break;
	                            }
	                        }
	                        if (!bul) {
	                            System.out.println("Arama basarisiz..Hesap bulunamadi..");
	                        }
	                        break;

	                    case 4:
	                        System.out.print("Account no giriniz : ");
	                        acn = KB.next();
	                        bul = false;
	                        for (int i = 0; i < C.length; i++) {
	                            bul = C[i].hesapArama(acn);
	                            if (bul) {
	                                C[i].cek();
	                                break;
	                            }
	                        }
	                        if (!bul) {
	                            System.out.println("Arama basarisiz..Hesap bulunamadi..");
	                        }
	                        break;

	                    case 5:
	                        System.out.println("Gule Gule Iyi Gunler..");
	                        break;
	                }
	            }
	            while (ch != 5);
	        }
}
