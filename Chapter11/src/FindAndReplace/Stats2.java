package FindAndReplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Stats2 {
	public static void main(String[] args) throws ClassNotFoundException
	{
		FileWriter out;
		BufferedWriter writeFile;
		
		int score;
		double avescore;
		double totalscore = 0;
		int numScore = 0;
		
		File stats; 
		Scanner input = new Scanner(System.in);
		
		float totalgrade = 0,counter = 0, highestmark = 0, lowestmark = 0;

		System.out.println("What is the file name:");
		String file = input.next();
		stats = new File(file + ".txt");
		
		System.out.println("How many students grades are being put in:");
		int numstudents = input.nextInt();
		
		try {
			out = new FileWriter(stats);
			writeFile =  new BufferedWriter(out);
			
			for (int i = 0; i < numstudents; i++) 
				{	
				System.out.println("What is the students name:");
				String name = input.next();
				
				System.out.println("Enter the test score:");
				score = input.nextInt();
				
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
				
				}
			
			for (int i = 0; i < numstudents; i++) 
			{	
				FileReader in;
				BufferedReader readFile;
				in = new FileReader(stats);
				readFile =  new BufferedReader(in);
				
				String score1;
				
				while ((score1 = readFile.readLine()) != null) 
				{
					numScore += 1;
					System.out.print(score1);
					totalscore += Double.parseDouble(score1);
				}
				
				avescore = totalscore/ numScore;
				System.out.println("Average = " + avescore);
				readFile.close();
				in.close();
			
				}
		}
		
	

		
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem with input/output");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}
}
		