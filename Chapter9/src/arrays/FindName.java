package arrays;

import java.util.Scanner;

public class FindName {
	public static int linear(String[] array, String nametoFind)
	{
		int numname;
		String names;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many names are you entering: ");
		numname = input.nextInt();
		
		String[] Findname = new String[numname]; 
		
		for(int i = 0; i < numname; i++)
		{
			System.out.println("What are the names: ");
			Findname[i] = input.next();
		}
		
		System.out.println("Who's name do you want to search: ");
		String searchname = input.next();
		
		
		return 0;
	}
}
