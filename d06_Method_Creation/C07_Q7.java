package d06_Method_Creation;

import java.util.Scanner;

public class C07_Q7 {

	public static void main(String[] args) {
		/*
		 * reverseString isminde bir method oluşturun. Bu method bir String'i parametre
		 * olarak alsın. Ve bu method, girilen String'i tersten yazsın. Terste yazılmış
		 * halini yazdırınız. Örn: String = "Java'yı Seviyorum." Print: .muroyiveS
		 * ıy'avaJ
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cumle giriniz: ");
		String str = scanner.nextLine();

		System.out.println(reverseString(str));
		scanner.close();

	}

	public static String reverseString(String str) {

		String str2 = str.trim();

		String strTers = "";

		for (int i = str2.length() - 1; i >= 0; i--) {

			strTers += str2.charAt(i);
		}

		return strTers;
	}

	/*
	 * String[] arr = str.trim().replaceAll("\\s+"," ").split(""); String strTers =
	 * ""; for (int i = arr.length-1; i >= 0; i--) { strTers += arr[i]; } return
	 * strTers;
	 */
}
