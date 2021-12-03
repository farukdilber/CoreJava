package d06_Method_Creation;

public class C06_Q6 {

	
		/*
        Problem tanýmý :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdýran parametreli bir method yazýnýz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        birKereYazdir("javacýlar çoook afilli arkadaþlar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default deðeri "" atadýk çünkü iþleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonuç metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);

	}

}
