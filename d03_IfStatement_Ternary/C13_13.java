package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C13_13 {

	public static void main(String[] args) {
//		Triangle Check  
		Scanner scanner = new Scanner(System.in);

	        int a;
	        int b;
	        int c;

	        System.out.print("Birinci say�y� giriniz: ");
	        a = scanner.nextInt();

	        System.out.print("�kinci say�y� giriniz: ");
	        b = scanner.nextInt();

	        System.out.print("���nc� say�y� giriniz: ");
	        c = scanner.nextInt();

	        if ((a * a) + (b * b) == c * c) {
	            System.out.println("Bu bir dik ��gendir.");
	        } else if ((a * a) + (c * c) == b * b) {
	            System.out.println("Bu bir dik ��gendir.");
	        } else if ((b * b) + (c * c) == a * a) {
	            System.out.println("Bu bir dik ��gendir.");
	        } else {
	            System.out.println("Bu ��gen bir dik ��gen de�ildir.");
	        }

scanner.close();
	}

}
