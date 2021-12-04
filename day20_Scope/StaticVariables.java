package day20_Scope;

public class StaticVariables {
static int not=10; 
	static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatilMi;
	public static void main(String[] args) {
		// static variable'lara static method'dan direk ulasilabilir mi ? EVET
System.out.println(not);
not++;

System.out.println(not);
staticMethod();
StaticVariables obje = new StaticVariables();
obje.staticOlmayanMethod();
System.out.println(not);
	}
public static void staticMethod() {
	// static variable'lara static method'dan direk ulasilabilir mi ? EVET
	StaticVariables faruk =  new StaticVariables();
	faruk.sayi=50;
	System.out.println("Faruk notu : " +faruk.sayi);
}
public void staticOlmayanMethod(){
	// static variable'lara static method'dan direk ulasilabilir mi ? EVET
	// static variable'lara static olan veya olmayan tum methodlardan ulasilabilir
	// bu yuzden static variablelara Class Variabler denir
	not++;
	System.out.println(not);
}
}
