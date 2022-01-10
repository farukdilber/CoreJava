package sorular;

import java.util.Arrays;

public class C01_Q8arrays {

	public static void main(String[] args) {
		/*
         * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
         */
	
	String str="Congratulations";
	String[] arr = str.split("");
	System.out.println(Arrays.toString(arr));
	for (int i = arr.length-1; i >=0; i--) {
		
		if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u")) {
			arr[i]= "i";
		}
		String virgul = arr[i].replaceAll(",", "");
		System.out.print(virgul);	
		
		
	}
	
	}

}
