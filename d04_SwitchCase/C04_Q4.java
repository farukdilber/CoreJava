package d04_SwitchCase;

import java.util.Scanner;

public class C04_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.print(
	                "Pazartesi: 1 \nSal�: 2 \n�ar�amba: 3 \nPer�embe: 4 \nCuma: 5 \nCumartesi: 6 \nPazar: 7 \nL�tfen haftan�n ka��nc� g�n�nde oldu�unuzu yaz�n: ");
	        int kanc�nc�Gun = scan.nextInt();
	        System.out.println("L�tfen ka� g�n sonras�n� merak etti�inizi yaz�n :");
	        int kacGun = scan.nextInt();
	        int hangiG�n = (kacGun % 7 + kanc�nc�Gun) % 7;
	        if (kanc�nc�Gun <= 7 && kanc�nc�Gun > 0) {
	            if (kacGun > 0) {
	                switch (hangiG�n) {
	                    case 1: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Pazartesi.");
	                        break;
	                    }
	                    case 2: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Sal�.");
	                        break;
	                    }
	                    case 3: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden �ar�amba.");
	                        break;
	                    }
	                    case 4: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Per�embe.");
	                        break;
	                    }
	                    case 5: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Cuma.");
	                        break;
	                    }
	                    case 6: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Cumartesi.");
	                        break;
	                    }
	                    case 7: {
	                        System.out.println(kacGun + " g�n sonra g�nlerden Pazar.");
	                        break;
	                    }
	                }
	            } else {
	                System.out.println("Ge�mi� ge�mi�te kald� :)");
	            }
	        } else {
	            System.out.println("Hafta 7 g�n dostum!");
	        }
	        scan.close();
	}

}
