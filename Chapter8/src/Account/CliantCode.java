package Account;

import java.util.Scanner;

import UEmployee.Employee;

public class CliantCode {
	
	public static Customer createcustomer()
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
			return (new PersonalAccount(fName, lName));
		}
		
		else 
		{
			return (new BusinessAccount(fName, lName));
		}
		
	}
	
	public static void main (String[] args)
	{
		Customer eX1;
		
		eX1 = createcustomer();
		System.out.print(eX1);

		
	}
}
