package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen bir arrayin tum elemanlarini toplayan bir program yazin
		int arr[]= {3,5,8,65,32,34};
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
System.out.println(toplam);
	//arrayin tum elemanlarini once kucukten buyuge sonra buyukten kucuge yazdirin
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
for (int i = arr.length-1; 0 < i; i--) {
	
	
}
int tersArray[]=new int[arr.length];
for (int i = 0; i < tersArray.length; i++) {
	tersArray[i]=arr[arr.length-1-i];
}
System.out.println(Arrays.toString(tersArray));
	
	
	}

}
