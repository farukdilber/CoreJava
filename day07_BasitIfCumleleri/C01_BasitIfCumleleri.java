package day07_BasitIfCumleleri;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen gun isimlerinden ilf harfini yaziniz ");
char ilkHarf=scan.next().toUpperCase().charAt(0);
if (ilkHarf=='P') {
	System.out.println("Pazartesi , Persembe, Pazar");
	}
if (ilkHarf=='S') {
	System.out.println("Sali");	
}
if (ilkHarf=='C') {
	System.out.println("Carsamba, Cuma , Cumartesi");
	}
if (ilkHarf!='C' && ilkHarf!='S' && ilkHarf!='P') {
	
}
scan.close();
	}

}
