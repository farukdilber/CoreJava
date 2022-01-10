package sorular;

import java.util.Arrays;

public class C01_Q3array {

	public static void main(String[] args) {
		/*    write a java program to find the second largest number in the array?
		Maximum and minimum number in the array?
		(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
		bulmak için bir java programi yazin)
		
		int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		
		*/
		int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		Arrays.sort(arr);
		int enbuyukikincisayi=arr[arr.length-2];
		int enkucuksayi=arr[0];
		int enbuyuksayi=arr[arr.length-1];
		System.out.print(enbuyukikincisayi+" "+enkucuksayi+" "+enbuyuksayi);
		
	}

}
