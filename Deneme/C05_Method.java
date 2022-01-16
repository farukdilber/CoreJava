package Deneme;

import java.util.Scanner;

public class C05_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.println("iki sayý giriniz  =");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        System.out.println("us olarak 2/ 3 giriniz");
        int us = scan.nextInt();
     
       
		 if (us == 3) {
            kupAl(sayi1, sayi2);
        } else if (us == 2) {
            kareAl(sayi1, sayi2);
            scan.close();
        }
      
    }
    private static void kupAl(int sayi1, int sayi2) {
        System.out.println(((Math.pow(sayi1, 3) + (Math.pow(sayi2, 3))))); 
    }
    private static void kareAl(int sayi1, int sayi2) {
        System.out.println((Math.pow(sayi1, 2) + (Math.pow(sayi2, 2))));
    }

	}


