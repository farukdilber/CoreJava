package sorular2;

import java.util.Arrays;
import java.util.Collections;

public class C11_Q10MirrorList {

	public static void main(String[] args) {
			/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
		int sayac=0;
		int arr1[] = { 1, 2, 3, 4,5,5, 4, 3, 2, 1 };
		for (int i = 0; i < arr1.length/2; i++) {
			if (arr1[i]==arr1[arr1.length-1-i]) {
				sayac++;
			
			}
		
		
		}if (sayac==arr1.length/2 && arr1.length%2==0) {
			System.out.println("Simetriktir");
		}else {
			System.out.println("Simetrik degildir");
		}
	
	}

}
