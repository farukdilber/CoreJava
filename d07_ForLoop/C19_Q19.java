package d07_ForLoop;

public class C19_Q19 {

	public static void main(String[] args) {
		 /*
	     Yýldýzlar (*) ile piramit oluþturabileceðiniz bir kod yazýnýz.
	            Sonuç böyle olmalýdýr;
	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
	     */

	    


	        for ( int satir = 1; satir < 6; satir++) {//satýr kontrolu

	            for (int bosluk = 5- satir; bosluk > 0; bosluk--) {//bosluklari 4,3,2,1 tane yazdýrmalýyým
	                System.out.print(" ");
	            }

	            for (int yildiz =  1; yildiz <=satir; yildiz++) {//yýldýz kontrolu
	                System.out.print("* ");//"*" yapýlýrsa saða dayalý üçgen olur
	            }

	            System.out.println();
	        }

	}

}
