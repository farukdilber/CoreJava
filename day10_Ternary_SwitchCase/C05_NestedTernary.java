package day10_Ternary_SwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		char cinsiyet='K';
		int yas = 57 ;
	String sonuc=	cinsiyet=='K' ? (yas>=60 ? "Emekli olabilrsin" : "Emekli olamazsin") :
	                                (yas<=60 ? "Emekli olabilrsin" : "Emekli olamazsin") ;
	System.out.println(sonuc);
	}

}
