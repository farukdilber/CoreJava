package BankaProjesi2;

public class Musteri {
String isim;
String soyisim;
String hesapno;
String sifre = "barbaramankenolan";
private long bakiye;
public Musteri() {
	
}
public Musteri(String isim,String soyisim,String hesapno) {
	this.isim=isim;
	this.soyisim=soyisim;
	this.hesapno=hesapno;
}
}
