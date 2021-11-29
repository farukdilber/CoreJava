package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen faktoriyel almak icin bir sayi girin ");
	        int sayi=scan.nextInt();
	        System.out.println(sayi+"!=");
	        int faktoriyel=1;
	        for (int i = sayi; i > 0; i--) {
				faktoriyel*=i;
				System.out.print(i +"*");
			}
	
	System.out.println(faktoriyel);
	
	scan.close();
	}

}
