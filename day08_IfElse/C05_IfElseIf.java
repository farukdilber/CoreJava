package day08_IfElse;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          System.out.println("Lutfen iki sayi yaziniz \nIlk sayidan sonra diger sayi icin enter basiniz");
          double sayi1=scan.nextDouble();
          double sayi2=scan.nextDouble();
          if(sayi1>0 && sayi2>0) {
        	  System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
          }
          else if (sayi1<0 && sayi2<0) {
        	  System.out.println("Sayilarin carpimi : " + (sayi1*sayi2));
        	  }
          else if (sayi1*sayi2<0){
			System.out.println("Farkli isaretlerde sayilarla islem yapamazsin ");
		}
          else {
			System.out.println("Sifir carpmada yutan elemandir ");
		}
       scan.close();   
	}

}
