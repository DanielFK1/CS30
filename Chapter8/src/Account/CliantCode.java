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
		
		System.out.println("Do you want to open you Personal or Business Account(P or B): ");
		String position = input.next();
		
		if (position.equalsIgnoreCase("P"))
		{
			System.out.println("What is your balance: ");
			int balance = input.nextInt();
			return (new Account(fName, lName, balance));
		}
		
		else 
		{
			System.out.println("What is your balance: ");
			int balance = input.nextInt();
			return (new Account(fName, lName, balance));
		}
		
	}
	
	public static void main (String[] args)
	{
		Account eX1;
		
		eX1 = createcustomer();
		System.out.print(eX1);

		
	}
}
