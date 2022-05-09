package arrays;

import java.util.Scanner;

public class FindName {
	public static void main(String[] args)
	{
		int numname;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many names are you entering: ");
		numname = input.nextInt();
		
		String[] Findname = new String[numname]; 
		
		for(int i = 0; i < numname; i++)
		{
			System.out.println("What are the names: ");
			Findname[i]= input.nextLine();
		}
		
		System.out.println("Who's name do you want to search: ");
		String searchname= input.nextLine();
		
		int location = Search.linear(Findname, searchname);
		
		if (location == -1)
		{
			System.out.println("Sorry name is not found in array");
		}
		else 
		{
			System.out.println("Name found in element " + location);
		}	

	}
}
