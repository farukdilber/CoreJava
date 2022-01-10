package sorular;

import java.util.Scanner;

public class C01_Q13arrays {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
         int[]arr=new int[8];
         int sayac= 0;
         Scanner scan=new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + ".elemani girin : ");
			arr[i]=scan.nextInt();
			if (arr[i]%3==0) {
				sayac++;
			}

		}
	System.out.print(sayac);
	scan.close();
	}

}
