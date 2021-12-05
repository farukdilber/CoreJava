package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "java ogrendim, #cok para ?kazandim.,"
		//cumlesinin kelimelerini ozel karakterler ve noktolama isaretleri olmadan
		//harf ve sirasina gore yazdirin
		String cumle ="java ogrendim, #cok para ?kazandim.,";
        String kelime[] = cumle.split(" ");
        for (int i = 0; i < kelime.length; i++) {
			kelime[i] = kelime[i].replaceAll("\\W", " ");
		
		}
        System.out.println(Arrays.toString(kelime));
       
	}

}
