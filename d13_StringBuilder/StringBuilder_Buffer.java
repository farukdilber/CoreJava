package d13_StringBuilder;

public class StringBuilder_Buffer {
	 /* String = daha yavas ,Immutable==> degisemez,

	            StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
	            StringBuffer synchronized,thread safe.

	            StringBuilders = mutable==>degisebilir ,
	            not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

	            1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin  StringBuilder  class'i uretmistir.

	            2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer clasi vardir. "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
	            "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir. "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
	            3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
	            	Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
	            String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.
	            	Bunun iki sebebi vardir:
	            	1) Java pass-by-value kullanir 2) String Class'i immutable Class'dir.
	            	*/
}