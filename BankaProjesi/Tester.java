package BankaProjesi;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		 Scanner kbInLine = new Scanner(System.in);
	        Scanner kbIn = new Scanner(System.in);

	        System.out.print("Isim giriniz : ");
	        String name = kbInLine.nextLine();

	        System.out.print("Bakiyenizi giriniz : $");
	        double balance = kbIn.nextDouble();

	        BankAccount myAccount = new BankAccount(balance, name);
	        String proceed = "y";

	        while(proceed.equalsIgnoreCase("y"))
	        {
	            System.out.println("\nListeden numara seciniz. Ne yapmak istersin...\n\t 1. Para Yatir\n\t 2. Para Cek\n\t 3. Bakiye goruntule\n");
	            int choice = kbIn.nextInt();

	            switch(choice)
	            {
	                case 1:
	                    System.out.print("Yatirmak istediginiz tutari giriniz?\n\t$");
	                    double deposit = kbIn.nextDouble();
	                    myAccount.deposit(deposit);
	                    System.out.println("You have deposited $" + deposit + " into the account of " + name + ". The new balance is: " + myAccount.balance);
	                    break;
	                case 2:
	                    System.out.print("Cekmek istediginiz tutari giriniz?\n\t$");
	                    double withdraw = kbIn.nextDouble();
	                    if(myAccount.balance - withdraw > 0)
	                    {
	                        myAccount.withdraw(withdraw);
	                        System.out.println("You have withdrawn $" + withdraw + " from the account of " + name + ". The new balance is: " + myAccount.balance);
	                    }
	                    else    
	                    {
	                        System.out.println("Sorry, you have insufficient funds for this operation. Your existing balance is $" + myAccount.balance);
	                    }
	                    break;
	                case 3:
	                    System.out.print("The balance in the account of " + name + " is $" + myAccount.balance);
	                    break;
	            }
	            System.out.print("\nWould you like to do another transaction? (Y/N)");
	            proceed = kbIn.next();
	        }
	        System.out.println("\nThank you for banking with us. Have a good day!");
    }
}
