package day04_incrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Lutfen cemberin yaricapini giriniz :");
         double yaricap=scan.nextDouble();
         double cevre=2*3.14*yaricap ;
         double alan=3.14*yaricap*yaricap ;
         System.out.println("Cemberin cevresi : " + cevre);
         System.out.println("Cemberin alani :"+ alan);
       scan.close();  
	}

}
