package arrays;

import java.util.Scanner;

public class HighestGrade {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] grades = new int[5];
		
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter the 5 grades between 0 and 100: ");
			grades[i] = input.nextInt();
		}
		
		int HighestGrades = grades[0];
		
		for(int i = 0; i < grades.length; i++)
		{
			if (HighestGrades < grades[i])
				HighestGrades = grades[i];	
		}
		System.out.println("Highest grade is " + HighestGrades);
	}
}
