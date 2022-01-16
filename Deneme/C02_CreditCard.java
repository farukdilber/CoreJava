package Deneme;

import java.util.Scanner;

public class C02_CreditCard {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kart numarasi giriniz");
		String cardNum=scan.next();
		
		
	    final int STARTLENGTH = 0;   //first digit of card you don't want to mask
	    final int ENDLENGTH = 4;    //last digit of card you don't want to mask
	    int maskedLength = cardNum.length() - (STARTLENGTH + ENDLENGTH);
//	    System.out.println(maskedLength);
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < maskedLength; i++) {
	        sb.append("*");
	    }
	    String maskedCard = cardNum.substring(0, STARTLENGTH) + sb + cardNum.substring(cardNum.length() - ENDLENGTH, cardNum.length());
	    System.out.println(maskedCard);
	}

}
