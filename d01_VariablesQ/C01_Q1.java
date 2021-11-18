package d01_VariablesQ;

public class C01_Q1 {

	public static void main(String[] args) {
		/*
		  \n (or \r): starts from a new line : metni bir alt satýrdan itibaren yazdýrýr.
		          \t:  horizontal tab : metni yatayda 1 tab miktarý kaydýrýr.
		          \\: prints a back slash :\ (ters slash) yazdýrýr
		          \': prints single quote :' tek týrnak yazdýrýr.
		          \": prints double quote :"" Çift týrnak yazdýrýr.
		 */
     System.out.println("\nStarts from a new line");  // System.out.println("\rStarts from a new line"); also we can do with \r
     System.out.println("\tHorizontal tab");
     System.out.println("\\");
     System.out.println("\'");
     System.out.println("\"");
	 System.out.println(" \"Hello\", \"World / \\ ");                         //   \"Hello \", \"World  \\ /\"
	 System.out.println("\tM\tO\tN\tD\tA\tY"); // also write like this   System.out.println("\nM\nO\nN\nD\nA\nY");
	 System.out.println("\'Life\' is awesome with \'Java\'");
	 System.out.println("\"Life\" is \n\'awesome\' \t\t\t with Java");
	}

}
