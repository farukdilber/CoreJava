package Deneme;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String kelime = scan.nextLine();

		if (kelime.length() % 2 == 0) {
			System.out.println(kelime.substring(0, kelime.length() / 2));
		} else {
			System.out.println("Yarisini alamam ");
		}
		scan.close();
	}

}
