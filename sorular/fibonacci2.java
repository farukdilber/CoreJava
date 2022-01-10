package sorular;

import java.util.Scanner;

public class fibonacci2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number  of terms: ");
        int count=scanner.nextInt();
        scanner.close();
        
        int firstTerm=1;
        int secondTerm=2;
        int nextTerm;
        
        System.out.println("-----------------------");
        System.out.print("Fibonacci Series: ");
        System.out.print(firstTerm+","+secondTerm);
        
        for(int i=3; i<=count; i++) {
            nextTerm=firstTerm+secondTerm;
            System.out.print(","+nextTerm);
            firstTerm=secondTerm;
            secondTerm=nextTerm;

	}
	}
}
