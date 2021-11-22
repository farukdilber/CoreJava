package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(5+3==8 || 6+5==10 || 7-2==3);
       System.out.println(5+3==8 && 6+5==10 && 7-2==3); 
       int a=10;
       int b=20;
       int c=30;
       boolean sonuc= a>b || b>c || a+b>=c ;
       System.out.println(sonuc);
       System.out.println(5+3==8 && 6+5==10 && 7-2==3);
       System.out.println(5+3==8 & 6+5==10 & 7-2==3);
       int yas=50;
       int boy=180;
       char cinsiyet ='M';
       System.out.println(yas<30 && boy>170 && cinsiyet=='M');
    		   
	}

}
