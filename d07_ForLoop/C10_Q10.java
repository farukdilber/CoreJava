package d07_ForLoop;

import java.util.Scanner;

public class C10_Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("harf giriniz: ");
		String kelime = scan.next();

		String sesliHarf = "aeuoi";
		String sessizHarf = "bcdfghjklmnprstvyzxwq";

		if (kelime.length() == 1) {

			for (int i = 0; i <= sessizHarf.length(); i++) {
				if (sesliHarf.contains(kelime)) {
					System.out.println("sesli");
					break;
				} else if (sessizHarf.contains(kelime)) {
					System.out.println("sessiz");
					break;
				} else
					System.out.println("Yanlis karakter girdiniz!!!");
				break;
			}
		} else
			System.out.println("Yanlis karakter girdiniz!!!");

		scan.close();
	}

}
