package day21_scope_arrays;

public class C03_Arrays {
	
	public static void main(String[] args) {
		// Elemanlari Ali Veli Ayse ve Fatma olan bir array olusturun 
		String arr[]=new String[4];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		String arr2[]= {"Ali","Veli","Ayse","Fatma"};
		arr[0]="Can";
		arr[2]="Gul";
		System.out.println(arr2[1]);
		System.out.println(arr[arr.length-1]);
	}

}
