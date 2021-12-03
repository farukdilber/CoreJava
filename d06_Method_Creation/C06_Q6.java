package d06_Method_Creation;

public class C06_Q6 {

	
		/*
        Problem tan�m� :
        Bir String i�indeki t�m karakterleri en fazla bir kez yazd�ran parametreli bir method yaz�n�z.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        birKereYazdir("javac�lar �oook afilli arkada�lar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default de�eri "" atad�k ��nk� i�leme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonu� metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);

	}

}
