package d07_ForLoop;

import java.util.Scanner;

public class C07_Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("pozitif bir tam sayý giriniz : ");
		int sayi = scan.nextInt();

		for (int baba = 1; baba <= sayi; baba++) {// satýr kontrolu
			for (int ogul = 1; ogul <= sayi; ogul++) {// sutun kontrolu
				if (baba == ogul) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
				System.out.println();
			}
		}
		scan.close();
	}

}