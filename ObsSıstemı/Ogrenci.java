package ObsSýstemý;



public class Ogrenci {
	
private String ogrenciAd;
private String dersAd;
private int not;
public Ogrenci() {
	
}
public Ogrenci(String ogrenciAd,String dersAd,int not) {
	this.ogrenciAd=ogrenciAd;
	this.dersAd=dersAd;
	this.not=not;

}
public String getOgrenciAd() {
	return ogrenciAd;
}
public void setOgrenciAd(String ogrenciAd) {
	this.ogrenciAd = ogrenciAd;
}
public String getDersAd() {
	return dersAd;
}
public void setDersAd(String dersAd) {
	this.dersAd = dersAd;
}
public int getNot() {
	return not;
}
public void setNot(int not) {
	this.not = not;
}

}
