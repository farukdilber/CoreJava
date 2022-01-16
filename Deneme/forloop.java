package Deneme;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		/* Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar

3’un kati olan sayilari yazdirin. */
		Scanner scan=new Scanner(System.in);
		System.out.println("10 dan kucur bir tam sayi giriniz : ");
		int sayi = scan.nextInt();
		int faktoriyel = 1 ;
	

		for (int i = 1; i <= sayi; i++) {
			
			faktoriyel = faktoriyel*i ;
			System.out.println(faktoriyel);

		}
		scan.close();
}
		     
}
