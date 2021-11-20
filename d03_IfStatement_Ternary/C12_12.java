package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int day;
        int month;
        int year;

        System.out.println("Tarihi gün,ay,yýl olarak istenen þekliyle giriniz... ");

        System.out.print("Gün: ");
        day = scanner.nextInt();

        if (day > 0 && day <= 31) {
            System.out.println(day);

        } else {
            System.out.println("Invalid enter, Program ending...");
           
        }


        System.out.print("Ay: ");
        month = scanner.nextInt();

        if (month > 0 && month <= 12) {
            System.out.println(month);

        } else {
            System.out.println("Invalid enter, Program ending...");
           // return;
        }

        System.out.print("Yýl: ");
        year = scanner.nextInt();

        if (year > 0) {
            System.out.println(year);

        } else {
            System.out.println("Invalid enter, Program ending...");
           // return;
        }

        System.out.println("Month/Day/Year : " + month + "/" + day + "/" + year);
        System.out.println("Gun/Month/Year : " + day + "/" + month + "/" + year);
scanner.close();
	}

}
