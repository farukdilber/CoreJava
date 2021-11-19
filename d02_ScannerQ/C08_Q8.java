package d02_ScannerQ;

import java.util.Scanner;

public class C08_Q8 {

	public static void main(String[] args) {
		  /*
         * Get the exams score from user and calculate the average note
         * Midterm exam %30'u final  %70 
         */


        Scanner scanner = new Scanner(System.in);

        int midTerm1,midTerm2,finalExam;
         
         

        System.out.print("midTerm1: ");
        midTerm1 = scanner.nextInt();

        System.out.print("midTerm2: ");
        midTerm2 = scanner.nextInt();

        System.out.print("finalExam: ");
        finalExam = scanner.nextInt();

        double sonuc = ((midTerm1 + midTerm2) / 2) * 0.3 + (finalExam * 0.7);
        System.out.print("Average Note: " + sonuc);
        scanner.close();
	}

}
