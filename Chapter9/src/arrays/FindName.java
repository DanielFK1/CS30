package arrays;

import java.util.Scanner;

public class FindName {
	public static int linear(String[] array, String nametoFind)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many names are you entering: ");
		int numname = input.nextInt();
		
		for(int i = 0; i < numname; i++)
		{
			System.out.println("What are the names: ");
			String names = input.next();
		}
		
		
		
		return 0;
	}
}
