package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yazini ");
        String isim = scan.next();
        System.out.println("Isminiz :" + isim);
	 scan.close();
	}

}
