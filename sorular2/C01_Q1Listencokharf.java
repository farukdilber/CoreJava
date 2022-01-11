package sorular2;

import java.util.Iterator;

public class C01_Q1Listencokharf {

	public static void main(String[] args) {
//		Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
//
//		input :
//
//		Learning java is easy
//
//		output:
//
//		maximum occurring character is : a
		String str = "hayat coooook bayat ";
		int[] tekrar = new int[str.length()];
		char maxChar = str.charAt(0);
		int max;
		char string[] = str.toCharArray();
		for (int i = 0; i < string.length; i++) {
			tekrar[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					tekrar[i]++;
					string[j] = '0';
				}
			}
		}
		max = tekrar[0];
		for (int i = 0; i < tekrar.length; i++) {
			if (max < tekrar[i]) {
				max = tekrar[i];
				maxChar =  string[i];
			}

		}
		System.out.println(maxChar);
	}
}
