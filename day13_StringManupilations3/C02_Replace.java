package day13_StringManupilations3;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin binden buyuk
//		olup olmadigini yazdirin
String sonuc="10.000";
sonuc=sonuc.replace(".", "");

if (Integer.valueOf(sonuc)>1000) {
	System.out.println("Bulunan sonuc sayisi 1000'den cok");
} else {
System.out.println("Bulunan sonuc sayisi 1000'den az" );
}
	}

}
