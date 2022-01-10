package sorular;

import java.util.Arrays;

public class C01_Q5arrays {

	public static void main(String[] args) {
		/*
		 * you have a string "GayetBasarýlý" with arrays change it to "CoookBasarýlý"
		 * and write changing array (String iniz: "GayetBasarýlý" Diziyi "CoookBasarýlý"
		 * ye cevirin )
		 *
		 */
		String str2 = "";
		String str = "GayetBasarýlý";
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
