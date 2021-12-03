package d06_Method_Creation;

public class C05_Q5 {

	public static void main(String[] args) {
		/*
		 * Problem tanýmý : Bir String içinde kaç kelime olduðunu yazdýran bir method
		 * yazýnýz. Test Data: Input the string: The quick brown fox jumps over the lazy
		 * dog. Expected Output: Number of words in the string: 9
		 */

		int sonuc = 0;

		sonuc = cumle("javacý arkadaþlar zehir gibi maaþallah en kýsa zamanda çok bin $'lý iþ bulurlar");

		System.out.println("Girilen String kelime sayýsý : " + sonuc);

	}

	public static int cumle(String str) {
		int count = 0;

		char space = ' ';// bu satýrý tanýmlamak yerine if þartýný ==' ' þeklinde de tanýmlayabilirdik.

		for (int a = 0; a < str.length(); a++) {
			if (str.charAt(a) == space) {
				count++;

			}
		}

		return count + 1;// niye count+1 çünki for içinde a<str.length e kadar ama eþit deðil 1 eksik
							// verir

	}

}
