package day06_Wrapper;

public class C02_Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = "Guzel";
		int sayi1 = 5;
		int sayi2 = 4;
		System.out.println(str1+ " " +str2 + " " +sayi1 + sayi2);
		System.out.println(str1 + " " + sayi1 + "" + str2 );
		System.out.println(str1 + " " + (sayi1+sayi2) + sayi2);
		System.out.println(str1 + " " + (sayi1-sayi2) + (sayi1+sayi2));
		System.out.println(sayi1 +""+ sayi2+" " + str2);
		
	}

}
