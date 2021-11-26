package day13_StringManupilations3;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		String cumle = "Java    cok     zevkli";
		cumle = cumle.replaceAll("\\s+", "");
		System.out.println(cumle);
		cumle = cumle.replaceAll("[a-k]", "");
		System.out.println(cumle);
		System.out.println(cumle.replaceAll("\\S", "*"));
		System.out.println(cumle.replaceAll("\\s", "*"));
	}

}
