package UEmployee;

import java.util.Scanner;

public class University {
	
	
	public static Employee createemployee() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = input.next();
		
		System.out.println("Enter last name: ");
		String lName = input.next();
		
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		
		System.out.println("Are you part of the Staff or Faculty(S or F): ");
		String position = input.next();
		if (position.equalsIgnoreCase("F"))
		{
			System.out.println("What is you department name: ");
			String dname = input.next();
			return (new Faculty(fName, lName, salary, dname));
				
		}
		
		else
		{
			System.out.println("What is your job title: ");
			String title = input.next();
			return (new Staff(fName, lName, salary, title));
		}
	}
	
	
	public static void main (String[] args)
	{
		Employee eX1,eX2;
		
		eX1 = createemployee();
		System.out.print(eX1);

		
	}
}
