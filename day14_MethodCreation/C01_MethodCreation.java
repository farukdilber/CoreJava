package day14_MethodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
		int sayi1=4;
		int sayi2=5;
		toplama(sayi1,sayi2);
	
	    carpma(sayi1,sayi2);
	}
	private static void carpma(int sayi1, int sayi2) {
		System.out.println("Sayilarin carpimi :" +(sayi1*sayi2));
		
	}
	private static void toplama(int sayi1,int sayi2) {
		System.out.println("Sayilarin toplami : " + (sayi1+sayi2));
	}

}
