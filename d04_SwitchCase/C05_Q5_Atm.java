package d04_SwitchCase;

import java.util.Scanner;

public class C05_Q5_Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("*****************************");
	        System.out.println("ATM'ye Ho�geldiniz...");

	        String islemler = "1.��lem : Bakiye ��renme\n2.��lem : Para Yat�rma\n"
	                + "3.��lem : Para �ekme\n"
	                + "4.��lem : ��k��";

	        System.out.println(islemler);
	        System.out.println("*****************************");

	        int bakiye = 1000;
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Yapmak istedi�iniz i�lemi se�iniz: ");
	        String islem = scan.nextLine();

	        switch (islem) {
	            case "1":
	                System.out.println("Bakiyeniz: " + bakiye);
	                break;

	            case "2":
	                System.out.print("Yat�rmak istedi�iniz tutar� girin: ");

	                int tutar = scan.nextInt();

	                bakiye += tutar;

	                System.out.println("Yeni bakiyeniz: " + bakiye);
	                break;


	            case "3":
	                System.out.print("�ekmek istedi�iniz tutar� girin: ");
	                int tutar2 = scan.nextInt();


	                if (tutar2 <= bakiye) {
	                    bakiye -= tutar2;
	                    System.out.println("Yeni bakiyeniz: " + bakiye);
	                } else {
	                    System.out.println("Yeterli bakiyeniz yok...");
	                }
	                break;

	            case "4":
	                System.out.println("��k�� yap�l�yor...");
	                break;
	            default:
	                System.out.println("Ge�ersiz i�lem...");
	                break;
	        }
	        scan.close();
	}

}