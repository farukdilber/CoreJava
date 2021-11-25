package day11_StringManupilations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsignorecase iki stringi karsilastirirken case sensitive olmadan kiyaslar
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		System.out.println(str4);
		System.out.println(str3==str4); // hem degerler hemde refereans farkli
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4)); // icerik ayni,case sensitive degil
	}

}
