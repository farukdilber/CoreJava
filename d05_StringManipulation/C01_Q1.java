package d05_StringManipulation;

import java.util.Scanner;

public class C01_Q1 {
	 public static void main(String[] args) {
	        // Kullan�c�dan alaca��n� bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Bir string giriniz = "); // Java ogren
	        String text = scan.nextLine();

	        boolean boslukVarMi = text.contains(" ");
	        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

	        // Kullan�c�dan alaca��n� bir stringin bos olup olmad���n� kontrol ediniz.
	        boolean bosMu = text.isEmpty();
	        System.out.println("bosMu = " + bosMu); //bosMu = false
	        scan.close();
	    }
}
