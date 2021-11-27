package d05_StringManipulation;

import java.util.Scanner;

public class C06_Q6 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan bir e-posta adresi girmesini isteyin, ard�ndan "hotmail"
		 * i�eriyorsa, "gmail" ile de�i�tirin, �rne�in: johnbrown@hotmail.com ==>
		 * johnbrown@gmail.com
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz");
		String email = scan.next();

		if (email.contains("hotmail")) {
			email = email.replace("hotmail", "gmail");
		}
		System.out.println(email);

		scan.close();

	}

}
