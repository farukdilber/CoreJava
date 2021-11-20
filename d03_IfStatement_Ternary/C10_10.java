package d03_IfStatement_Ternary;

public class C10_10 {

	public static void main(String[] args) {
	

    double number = 45;

    if (number % 5 == 0 && number % 8 == 0) {
        System.out.println("able to divide by 5 and 8");
    } else if (number % 10 == 5 && number % 9 == 0) {
        System.out.println("able to divide by 9 and divide by 10 reminder is 5");
    }

	}

}
