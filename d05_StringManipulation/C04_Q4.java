package d05_StringManipulation;

import java.util.Scanner;

public class C04_Q4 {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin
		// ve girilen kelimeyi tersten yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("4 harfli kelime giriniz : "); // cuma
		String str = scan.nextLine();

		if (str.length() != 4) {
			System.out.print("l�tfen 4 karakterli kelime giriniz");
		} else {
			System.out.print("tersten kelime : "); // tersten kelime : amuc
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));

		}
		scan.close();

	}

}
