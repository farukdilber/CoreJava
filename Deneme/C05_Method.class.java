package Deneme;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan= new Scanner(System.in);
 System.out.println("Lutfen vize notu giriniz : ");
 double vize1 =scan.nextDouble();
 
 System.out.println("Vize sinavi yuzdesini giriniz :");
 double vize_ortalamasi = scan.nextDouble();
 
 System.out.println("final vize notu giriniz : ");
 double final1 =scan.nextDouble();
 
 System.out.println("final sinavi yuzdesini giriniz :");
 double final_ortalamasi = scan.nextDouble();
 
 double ortalama= (vize1*vize_ortalamasi/100) + (final1*final_ortalamasi/100) ;
 System.out.println("Ortalamaniz :" + ortalama);
if (ortalama>=90) { System.out.println("Gecme notunu :  AA");

	
}
else if (ortalama>=80) { System.out.println("Gecme notunuz   BA");


}
else if (ortalama>=70) { System.out.println("Gecme notunuz   BB");


}
else if (ortalama>=60) { System.out.println("Gecme notunuz   CB");


}
else if (ortalama>=50) { System.out.println("Gecme notunuz   CC");


}
else if (ortalama>=40) { System.out.println("Gecme notunu   DC");

	
}
else if (ortalama>=30) { System.out.println("Gecme notunu :  DD");


}
else System.out.println("Gecme notunuz :  FF");
	}

}
