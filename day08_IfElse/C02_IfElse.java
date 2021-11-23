package day08_IfElse;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen bir harf giriniz ");
       char karekter=scan.next().charAt(0);
       if (karekter>='A' && karekter<='Z' || karekter>='A' && karekter<='Z') {
    	   System.out.println("Girdiginiz karekter harftir ");
    	   }
       else {System.out.println("Girdiginiz " +karekter+ "harf degildir");
		
	}
       scan.close();
	}

}
