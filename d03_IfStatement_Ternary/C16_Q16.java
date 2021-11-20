package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C16_Q16 {

	public static void main(String[] args) {
		// Check the year is not
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir yýl giriniz : ");
		int year = scan.nextInt();
		System.out.println ("   ***   if cözumu   ***   ");
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL");
		} else if (year % 100 != 0 && year % 4 == 0) {
			System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL");
		} else {
			System.out.println("Girdiðiniz"+year + " yýlý ARTIK YIL deðildir.");
		}

		//  ternary 
		System.out.println ("   ***   ternary    ***   ");

		String result = year % 100 == 0 ? year % 400 == 0 ? "Artik Yil" : "Artik Yil Degil"
				: year % 4 == 0 ? "Artik Yil" : "Artik Yil Degil";
		System.out.println(result);
		

		scan.close();
	}

}
