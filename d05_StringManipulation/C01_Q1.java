package d05_StringManipulation;

import java.util.Scanner;

public class C01_Q1 {
	 public static void main(String[] args) {
	        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Bir string giriniz = "); // Java ogren
	        String text = scan.nextLine();

	        boolean boslukVarMi = text.contains(" ");
	        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

	        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
	        boolean bosMu = text.isEmpty();
	        System.out.println("bosMu = " + bosMu); //bosMu = false
	        scan.close();
	    }
}
