package day17_forLoops;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak icin bir yazi yazin ");
        String str=scan.nextLine();
	if (str.equals(tersineCevir(str))) {
		System.out.println("Girdiginiz string palindrome");
		
	}
	
	
	scan.close();
	}

	private static String tersineCevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0 ; i--) {
			
		tersStr+=str.substring(i,i+1);
		}
		
		
		return tersStr;
	}



	
}

