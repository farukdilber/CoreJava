package sorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
       
		List<String> urunler = Arrays.asList("Portakal", "Greyfurt", "Mandalina", "Muz", "Elma");
		List<Integer> fiyat = Arrays.asList(1,2,3,4,5);
		Scanner scan = new Scanner(System.in);
		System.out.println("Sezon meyve ve sebzelerimiz iyi alisverisler : " + urunler);
		
		List<String> sepet = new ArrayList<>();
		List<Integer> kilo = new ArrayList<>();
		int toplam = 0;
		String son = "";
		String bitir = "";
		int kg = 0;
		do  {
			System.out.println("Urun seciniz ve kilogramini giriniz ");
			
			son = scan.next();
			kg = scan.nextInt();
            sepet.add(son);
       for (int i = 0; i < urunler.size(); i++) {
    	   if (son.equalsIgnoreCase(urunler.get(i))) {
    		 toplam+= fiyat.get(i)*kg;
    		 System.out.println("Bitirmek istiyor musun : E/H");
    		 bitir=scan.next();
		}
		
	}
		} while (!bitir.equalsIgnoreCase("E"));
//		sepet.remove(sepet.size()-1);
		System.out.println(sepet );
	  
		
	    System.out.println(toplam +" "+ "Euro");
	}

}
