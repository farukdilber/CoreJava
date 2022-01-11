package sorular2;

public class C01_Q3Terstenyazdirma {

	public static void main(String[] args) {
//		Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.
//
//		Note: Upper and lower case letters, spaces and special characters will not be changed.
// 
//		Input :
//
//		It is very nice to write code.
//
//		Output :
//
//		.edoc etirw ot ecin yrev si tI
        String str = "It is very nice to write code.";
        char[] charArray = str.toCharArray();
        System.out.println("Girilen :" + str);
        reverse(charArray);
        String revStr = new String(charArray);
        System.out.println("Cikan :" +revStr);
        
	}
        public static void reverse (char str[]){    
	int r = str.length-1, a =0;
	while (a<=r) {
		
	char tmp = str[a];
	str[a]=str[r];
	str[r]=tmp;
	a++;
	r--;
	}
	
	}

}
