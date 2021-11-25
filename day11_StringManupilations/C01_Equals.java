package day11_StringManupilations;

public class C01_Equals {

	public static void main(String[] args) {
		int a=10;
		int b=a+0;
		System.out.println(a==b);
		char ch1='K';
		char ch2='K' + 0 ;
		System.out.println(ch1==ch2);
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4)); // 
		 
	}

}
