package Deneme;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(Oyun: piyango) Madde 3.8 Lottery.java �y� yeniden d�zenleyerek �� basamakl� say�lardan bir piyango olu�turun.
		 *  Program kullan�c�dan �� basamakl� bir say� als�n ve a�a��daki kurallara g�re kazanc�n� g�stersin:
			1. E�er girilen say� piyangoda kazanan say� ile birebir ayn�s� ise; �d�l 10 000 TL
			2. E�er girilen say�n�n t�m basamaklar� piyangoda kazanan say� ile ayn� ise; �d�l 3 000 TL
            3. E�er girilen say�n�n bir basama�� piyangoda kazanan say� ile ayn� ise; �d�l 1 000 TL */
		
		Scanner input = new Scanner(System.in);
        int game;
        int times;
        int randNum; 
        int lotNum;
        int sum = 0;
        System.out.println("Lutfen bir sayi giriniz ");
         game = input.nextInt();

        System.out.print("How many games would you like to play? ");
        times = input.nextInt();
        System.out.println("Thank you! The numbers selected were: ");
        for(int i = 0; i < times; i++) {
            lotNum = 0;
            for(int j = 0; j < game; j++)
            {
                randNum = (new java.util.Random()).nextInt(10);
                lotNum = (lotNum * 10) + randNum;
                System.out.print(randNum);
            }
            System.out.println();
            sum += lotNum;   
        }
        System.out.println("Sum of the numbers of all games: " + sum);
		
		
	}

}
