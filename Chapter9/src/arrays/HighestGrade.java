package arrays;

import java.util.Scanner;
import java.math.*;

public class HighestGrade {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] grades = new int[5];
		
		
		for(int i = 1; i < 6; i++)
		{
			System.out.println("Enter the 5 grades: ");
			grades[i] = input.nextInt();
		}
		
		int HighestGrades = grades[1];
		for(int i = 1; i < 6; i++)
		{
			if (HighestGrades < grades[i])
				HighestGrades = grades[i];	
		}
		System.out.println("Highest grade is " + HighestGrades);
	}
}
