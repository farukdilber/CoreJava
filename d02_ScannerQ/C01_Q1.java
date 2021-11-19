package d02_ScannerQ;

import java.util.Scanner;

public class C01_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner (System.in);
       String name,surname;
       int age,weight;
       double height;
       System.out.println("Write your name :");
       name=scan.nextLine();
       System.out.println("Write your surname :");
       surname=scan.nextLine();
       System.out.println("Write your age :");
       age=scan.nextInt();
       System.out.println("Write your weight :");
       weight=scan.nextInt();
       System.out.println("Write your height :");
       height=scan.nextDouble();
       System.out.println(name+"\n"+surname+"\n"+age+"\n"+weight+"\n"+height);
       scan.close();
	}

}
