package sorular;

public class C01_Q10 {

	public static void main(String[] args) {
		 //  Elinizde bir miktar farkl� boylarda somun ve bu somunlara uyacak civatalar olsun.
		//Civatalar� somunlara e�lemek i�in nas�l bir algoritma yazars�n�z.
int[]arrCivata={1,3,4};
int[]arrSomun= {2,4,6};

for (int i = 0; i < arrCivata.length; i++) {
	for (int j = 0; j < arrSomun.length; j++) {
		if (arrCivata[i]<arrSomun[j]) {
			int uyanlar = arrCivata[i]; // 1 3 4
			arrCivata[i] = arrSomun[j]; // 2 4 6
			arrSomun[j]= uyanlar;
			
		}
		
	}
} for (int i = 0; i < arrCivata.length; i++) {
	System.out.println(arrCivata[i]+" "+arrSomun[i]);
}

	}

}
