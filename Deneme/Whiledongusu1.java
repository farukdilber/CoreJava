package Deneme;

import java.util.Iterator;
import java.util.Scanner;

public class Whiledongusu1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Negatif ve pozitif sayi giriniz ; ");
		int positiveNum=0, negativeNum=0;
		int num;
		while ((num = Integer.parseInt(scan.nextLine()))!=0) {
			if(num>0)
				positiveNum+=num;
		 else
            negativeNum+=num;
			displayResult(positiveNum,negativeNum);
	}
	}
public static void displayResult(int positiveNum,int negativeNum) {
	if(positiveNum>0)
	System.out.println("Sum of the positive numbers" + positiveNum);
	else System.out.println("pozitif sayi girmediniz ");
	if(negativeNum<0)
		System.out.println("Sum of the negative number"+negativeNum);
	else System.out.println("Negative sayi girmediniz ");
}
}
