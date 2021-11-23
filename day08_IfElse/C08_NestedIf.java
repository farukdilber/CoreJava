package day08_IfElse;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E,kadin icin K ");
           char cinsiyet=scan.next().toLowerCase().charAt(0);
           System.out.println("Lutfen yasinizi giriniz");
           double yas=scan.nextDouble();
          if (cinsiyet=='E') {
			if (yas>=65) {
				System.out.println("Emekli olabilirsiniz");
			}else {
				System.out.println("Emekli olamazsiniz ");
			}
		} else if(cinsiyet=='K') {
			if (yas>=60) {
				System.out.println("Emekli olabilirsiniz");
			} else {
				System.out.println("Emekli olamazsiniz ");
			}
		} else {
			System.out.println("Lutfen cinsiyeti dogru giriniz ");
		}
		
		scan.close();
	}

}
