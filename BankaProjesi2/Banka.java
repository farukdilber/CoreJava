package BankaProjesi2;

import java.util.Scanner;

class Bank {
	private String accno;
	private String name;
	private long balance;

	Scanner KB = new Scanner(System.in);

	void hesapAc() {
		System.out.print("Account No Giriniz: ");
		accno = KB.next();
		System.out.print("Isim giriniz: ");
		name = KB.next();
		System.out.print("Bakiyenizi giriniz: ");
		balance = KB.nextLong();
	}

	
	void hesapGoster() {
		System.out.println(accno + "," + name + "," + balance);
	}

	
	void yatir() {
		long amt;
		System.out.println("Yatirma istediginiz miktari giriniz : ");
		amt = KB.nextLong();
		balance = balance + amt;
	}

	
	void cek() {
		long amt;
		System.out.println("Cekmek istediginiz miktari giriniz : ");
		amt = KB.nextLong();
		if (balance >= amt) {
			balance = balance - amt;
		} else {
			System.out.println("Yetersiz bakiye..Islem basarisiz..");
		}
	}

	// account numarasi kontrol etme
	boolean hesapArama(String acn) {
		if (accno.equals(acn)) {
			hesapGoster();
			return (true);
		}
		return (false);
	}
}
