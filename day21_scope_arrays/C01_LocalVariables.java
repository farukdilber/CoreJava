package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
		//Java local variablelara default deger atamasi yapmaz
		//kodlarda problem yasamamak icin deger atamakta fayda var
		
		int sayi=0; // int sayi; derse CTE aliriz
		System.out.println(sayi);
		String isim="Ali";
		System.out.println(isim);
		staticMethod();
	}
public static void staticMethod() {
	String isim="Veli";
	System.out.println(isim);
}
	}


