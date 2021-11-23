package day08_IfElse;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir not giriniz :");
        double not=scan.nextDouble();
        if (not<0 || not>100) {
			System.out.println("Lutfen gecerli bir not giriniz ");
		}
        else if (not<50) {
        	System.out.println("Notunuz : D");
			
		}
        else if ( not<60) {
        	System.out.println("Notunuz : C");
			
		}
        else if (not<80) {
        	System.out.println("Notunuz : B");
			
		}
        else  {
        	System.out.println("Notunuz : A");
			
		}
	scan.close();
	}

}
