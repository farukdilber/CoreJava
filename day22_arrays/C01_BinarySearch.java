package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = {"Hacer","ainagul","Emine","Murat","Kutlu"};
        //isimler arrayinde murat ismi var mi
		//arrayde arama yapmadan once siralama yapmaliyiz
		Arrays.sort(isimler);
		// arrays class sort yaptigimizda kalici olarak degisir
		System.out.println(Arrays.toString(isimler));
        //sort methodu elementleri naturel order gore siralar
		isimler[4]="Ainagul";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		System.out.println(Arrays.binarySearch(isimler, "Emine"));
		
	}

}
