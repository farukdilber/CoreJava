package sorular;


import java.util.Scanner;
public class Hangman {

	private static  String[] filmler = {"Fight Club", "AROG", "Yahsi Bati", "GORA", "YuzuklerinEfendisi", "Avangers", "Batman", "Superman",
            "Joker", "Vizontele"};
	private static String kelime = filmler[(int) (Math.random() * filmler.length)];
    private static String harf = new String(new char[kelime.length()]).replace("\0", "*");
    private static int sayac = 0;
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sayac < 7 && harf.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(harf);
			String tahmin = sc.next();
			hang(tahmin);
		}
		sc.close();
	}

	public static void hang(String tahmin1) {
		String yeni = "";
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.toLowerCase().charAt(i) == tahmin1.charAt(0)) {
				yeni += tahmin1.charAt(0);
			} else if (harf.charAt(i) != '*') {
				yeni += kelime.charAt(i);
			} else {
				yeni += "*";
			}
		}

		if (harf.equals(yeni)) {
			sayac++;
			
		} else {
			harf = yeni;
		}
		if (harf.equals(kelime)) {
			System.out.println("Correct! You win! The word was " + kelime);
		}
		
	}
}