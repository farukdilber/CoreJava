package d07_ForLoop;

import java.util.Scanner;

public class C14_Q14 {

	/*
	 Ekran Çýktýsý
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
	 */

public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
    System.out.print("pozitif bir tam sayý giriniz : ");
    int sayi = scan.nextInt();

    for (int satir = 1; satir <= sayi; satir++) {//satýr kontrolu
        for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
            System.out.print(" ");
        }
        for (int yildiz = 1; yildiz <= satir; yildiz++) {//yýldýz kontrolu
            System.out.print("*");

        }
        System.out.println();
    }
     /*
                *
                * *
                * * *
                * * * *
                * * * * *
                þeklini yazdýrýnýz
         */

    for (int satir = 1; satir <= sayi; satir++) {//satýr kontrolu

        for (int yildiz = 1; yildiz <= satir; yildiz++) {//yýldýz kontrolu
            System.out.print("*");

        }
        System.out.println();
    }
scan.close();
}
}