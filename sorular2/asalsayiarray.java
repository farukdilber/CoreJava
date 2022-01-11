package sorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asalsayiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          input 100 e kadar asal sayilari yazdir
//		asalYap(1);
//	}
//
//	private static int[] asalYap(int verilenSayi) {
//		// TODO Auto-generated method stub
////		int arr[] = new int[25];
//		int asalSayi = verilenSayi+1;
		List<Integer> asalSayi1 = new ArrayList<>();		
		int toplam = 0;
		for (int i = 0; i < 100; i++) {
			
				
				for (int j = 2; j < i; j++) {
					if (i%j==0) {
						toplam++;
					
					}
					
				
			}
				if (toplam==2) {
					asalSayi1.add(i);
				}
				
		}
		System.out.println(asalSayi1);
		
		
	
	}

}
