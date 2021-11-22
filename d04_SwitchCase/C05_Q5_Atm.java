package d04_SwitchCase;

import java.util.Scanner;

public class C05_Q5_Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("*****************************");
	        System.out.println("ATM'ye Hoþgeldiniz...");

	        String islemler = "1.Ýþlem : Bakiye Öðrenme\n2.Ýþlem : Para Yatýrma\n"
	                + "3.Ýþlem : Para Çekme\n"
	                + "4.Ýþlem : Çýkýþ";

	        System.out.println(islemler);
	        System.out.println("*****************************");

	        int bakiye = 1000;
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Yapmak istediðiniz iþlemi seçiniz: ");
	        String islem = scan.nextLine();

	        switch (islem) {
	            case "1":
	                System.out.println("Bakiyeniz: " + bakiye);
	                break;

	            case "2":
	                System.out.print("Yatýrmak istediðiniz tutarý girin: ");

	                int tutar = scan.nextInt();

	                bakiye += tutar;

	                System.out.println("Yeni bakiyeniz: " + bakiye);
	                break;


	            case "3":
	                System.out.print("Çekmek istediðiniz tutarý girin: ");
	                int tutar2 = scan.nextInt();


	                if (tutar2 <= bakiye) {
	                    bakiye -= tutar2;
	                    System.out.println("Yeni bakiyeniz: " + bakiye);
	                } else {
	                    System.out.println("Yeterli bakiyeniz yok...");
	                }
	                break;

	            case "4":
	                System.out.println("Çýkýþ yapýlýyor...");
	                break;
	            default:
	                System.out.println("Geçersiz iþlem...");
	                break;
	        }
	        scan.close();
	}

}
