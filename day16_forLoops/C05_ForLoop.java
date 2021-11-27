package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          System.out.println("Lutfen yuzden kucuk bir sayi giriniz...");
          int num = scan.nextInt();
          for (int i = 0; i <= num; i++) {
			if (i%3==0) {
				System.out.print(i + " ");
			}
		 if(num<0) {
			System.out.println("Negatif sayi yazdiramam");
		}
	}
	}
}
