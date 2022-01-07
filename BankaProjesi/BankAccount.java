package BankaProjesi;

import java.util.Scanner;

public class BankAccount {
	public BankAccount(double b, String n)
    {
        this.balance = b;
        this.name = n;
    }
    public void deposit(double d)
    {
        balance += d;
    }
    public void withdraw(double w)
    {
        balance -= w;
    }
    public String nickname()
    {
        System.out.print("Enter a new name: ");
        Scanner kbIn = new Scanner(System.in);
        String n = kbIn.nextLine();
        return n;
    }
    double balance;
    String name;
	
	   
}
