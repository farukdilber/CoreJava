package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak icin bir yazi yazin ");
        String str=scan.nextLine();
	
	
	System.out.println(tersineCevir(str));
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
