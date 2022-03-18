package Account;

import java.util.Scanner;

import Account.Customer;

public class CliantCode {
	
	public static Account createcustomer()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = input.next();
		
		System.out.println("Enter last name: ");
		String lName = input.next();
		
		System.out.println("How much do you have in your account: ");
		int balance = input.nextInt();
		
		System.out.println("How much do you want to deposit: ");
		int deposit = input.nextInt();
		
		System.out.println("Would you like to open your Business or Personal account(B or P): ");
		String position = input.next();
		
		if (position.equalsIgnoreCase("P"))
		{
			System.out.println("What is your balance: ");
		}
		
		else 
			System.out.println("What is your balance: ");
			//return (new Account(fName, lName, deposit));
		
		return (new Account(fName, lName, balance, deposit));
		
	
		
		
	}
	
	public static void main (String[] args)
	{
		Account eX1;
		
		eX1 = createcustomer();
		System.out.print(eX1);

		
	}
}
