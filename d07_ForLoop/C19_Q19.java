package d07_ForLoop;

public class C19_Q19 {

	public static void main(String[] args) {
		 /*
	     Y�ld�zlar (*) ile piramit olu�turabilece�iniz bir kod yaz�n�z.
	            Sonu� b�yle olmal�d�r;
	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
	     */

	    


	        for ( int satir = 1; satir < 6; satir++) {//sat�r kontrolu

	            for (int bosluk = 5- satir; bosluk > 0; bosluk--) {//bosluklari 4,3,2,1 tane yazd�rmal�y�m
	                System.out.print(" ");
	            }

	            for (int yildiz =  1; yildiz <=satir; yildiz++) {//y�ld�z kontrolu
	                System.out.print("* ");//"*" yap�l�rsa sa�a dayal� ��gen olur
	            }

	            System.out.println();
	        }

	}

}
