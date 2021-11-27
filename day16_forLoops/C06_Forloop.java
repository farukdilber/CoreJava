package day16_forLoops;

import java.util.Scanner;

public class C06_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen yuzden kucuk bir sayi giriniz");
int num = scan.nextInt();
for (int i = 0; i < num; i++) {
	if (i%3==0 || i%5==0) {
		System.out.println(i+ " ");
	}
}
scan.close();
	}

}
