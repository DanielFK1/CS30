package arrays;

import java.util.Scanner;

public class FindName {
	public static void main(String[] args)
	{
		int numname, location;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many names are you entering: ");
		numname = input.nextInt();
		
		String[] Findname = new String[numname]; 
		
		for(int i = 0; i < Findname.length; i++)
		{
			System.out.println("What are the names: ");
			Findname[i] = input.next();
		}
		
		System.out.println("Who's name do you want to search: ");
		String searchname= input.next();
		
		location = Search.linear(Findname, searchname);
		if (location == -1)
		{
			System.out.println("Sorry name is not found in array");
		}
		else 
		{
			System.out.println("First occurance is element " + location);
		}	
		
	}
}
