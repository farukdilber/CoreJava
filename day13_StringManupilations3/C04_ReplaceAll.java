package day13_StringManupilations3;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		String str = "*Java 98ogrenmek c..ok k876olay";
		str = str.replaceAll("\\d", "");
		str = str.replaceAll("\\s", "x");
		str = str.replaceAll("\\W", "");
		str = str.replace("x", " ");
		System.out.println(str);
	}

}
