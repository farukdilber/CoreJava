package sorular;

import java.util.Arrays;

public class C01_Q5arrays {

	public static void main(String[] args) {
		/*
		 * you have a string "GayetBasar�l�" with arrays change it to "CoookBasar�l�"
		 * and write changing array (String iniz: "GayetBasar�l�" Diziyi "CoookBasar�l�"
		 * ye cevirin )
		 *
		 */
		String str2 = "";
		String str = "GayetBasar�l�";
		String str1 = "CoookBasarili";
		String arr[] = str.split("");
		String arr1[] = str1.split("");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr1[i];

			System.out.print(arr[i] + "");
		}
//System.out.println(Arrays.toString(arr));

	}

}
