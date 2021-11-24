package day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("Lutfen bir sayi giriniz ");
      double sayi1=scan.nextInt();
      System.out.println("Lutfen bir sayi daha giriniz ");
      double sayi2=scan.nextInt();
	
	System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
	
	scan.close();
	}

}
