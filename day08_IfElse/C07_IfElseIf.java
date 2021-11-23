package day08_IfElse;

import java.util.Scanner;

public class C07_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Maas icin bir teklif giriniz");
int teklif=scan.nextInt();
if (teklif>80000) { System.out.println("Kabul Ediyorum ");
	}
else if (teklif>60000) {System.out.println("Konusabiliriz ");
	
}
else {
	System.out.println("Maalesef kabul edemem");
}
scan.close();
	}

}
