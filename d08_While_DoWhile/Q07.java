package d08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        // Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        // ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.
        Scanner scan = new Scanner(System.in);
        String str = "";


        do {
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) break; // break : döngü kýrýyor

            System.out.println("Program çalýþýyor");
        } while (!str.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");

    }
}
