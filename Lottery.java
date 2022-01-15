package Deneme;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(Oyun: piyango) Madde 3.8 Lottery.java ‘yý yeniden düzenleyerek üç basamaklý sayýlardan bir piyango oluþturun.
		 *  Program kullanýcýdan üç basamaklý bir sayý alsýn ve aþaðýdaki kurallara göre kazancýný göstersin:
			1. Eðer girilen sayý piyangoda kazanan sayý ile birebir aynýsý ise; ödül 10 000 TL
			2. Eðer girilen sayýnýn tüm basamaklarý piyangoda kazanan sayý ile ayný ise; ödül 3 000 TL
            3. Eðer girilen sayýnýn bir basamaðý piyangoda kazanan sayý ile ayný ise; ödül 1 000 TL */
		
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
