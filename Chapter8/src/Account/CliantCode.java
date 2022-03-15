package Account;

import java.util.Scanner;

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
			
		}
		
		else 
		{
			
		}
		
	}
}
