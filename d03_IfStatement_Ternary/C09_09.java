package d03_IfStatement_Ternary;

import java.util.Scanner;

public class C09_09 {

	public static void main(String[] args) {
		/*
		 * SORU 1
		 * 
		 * Shopping and Shopping cart discount
		 */
		

			Scanner scan = new Scanner(System.in);

			System.out.println("Please enter quantity of your items ");
			int quantity = scan.nextInt();

			System.out.println("Please enter list price");
			double price = scan.nextDouble();
			double totalPrice;

			System.out
					.println("Do you have a customer card ?  [Y] or [N] ");
			char card = scan.next().toLowerCase().charAt(0);

			if (card == 'y') {
				if (quantity > 10) {
					price *= 0.8; // price = price*0.8
					totalPrice = price * quantity;
					System.out
							.println("%20 Discount. Total price : "
									+ totalPrice);
				} else {
					price *= 0.85;
					totalPrice = price * quantity;
					System.out
							.println("%15 Discount. Total price: "
									+ totalPrice);
				}
			} else if (card == 'n') {
				if (quantity > 10) {
					price*= 0.85;
					totalPrice = price*quantity;
					System.out.println("%15 Discount. Total price : " + totalPrice);
					
				}else{
					price = price - price*10/100;
					totalPrice = price*quantity;
					System.out.println("%10 Discount. Total price : " + totalPrice);
				}
			}else{
				System.out.println("Try Again!");
			}

			scan.close();

	}

}
