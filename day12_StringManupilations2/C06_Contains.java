package day12_StringManupilations2;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen gmail adresinizi giriniz");
String email=scan.next();
int uzunluk=email.length();
int index=email.lastIndexOf("@gmail.com");
if (!email.contains("@gmail")) {
	System.out.println("Lutfen gmail adresi giriniz ");
	
} else if(index==uzunluk-10) {
	System.out.println("Basari ile kaydedildi");
	
}else {
	System.out.println("Lutfen yazimi kontrol edin");
	
}
scan.close();
	}

}
