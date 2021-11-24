package day10_Ternary_SwitchCase;

public class C06_NestedTernary {

	public static void main(String[] args) {
		char krk = 's';
		String sonuc = (krk >= 'a' && krk <= 'z') ? "Kucuk harf"
				: krk >= 'A' && krk <= 'Z' ? "Buyuk Harf" : "Girilen karekter harf degildir";
		System.out.println(sonuc);
	}

}
