package d06_Method_Creation;

public class C05_Q5 {

	public static void main(String[] args) {
		/*
		 * Problem tan�m� : Bir String i�inde ka� kelime oldu�unu yazd�ran bir method
		 * yaz�n�z. Test Data: Input the string: The quick brown fox jumps over the lazy
		 * dog. Expected Output: Number of words in the string: 9
		 */

		int sonuc = 0;

		sonuc = cumle("javac� arkada�lar zehir gibi maa�allah en k�sa zamanda �ok bin $'l� i� bulurlar");

		System.out.println("Girilen String kelime say�s� : " + sonuc);

	}

	public static int cumle(String str) {
		int count = 0;

		char space = ' ';// bu sat�r� tan�mlamak yerine if �art�n� ==' ' �eklinde de tan�mlayabilirdik.

		for (int a = 0; a < str.length(); a++) {
			if (str.charAt(a) == space) {
				count++;

			}
		}

		return count + 1;// niye count+1 ��nki for i�inde a<str.length e kadar ama e�it de�il 1 eksik
							// verir

	}

}
