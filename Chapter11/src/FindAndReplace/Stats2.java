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
		String name;
		String score = null;
		double avescore = 0;
		double totalscore = 0;
		int numScore = 0;
		
		File stats; 
		Scanner input = new Scanner(System.in);

		System.out.println("What is the file name:");
		String file = input.next();
		
		
		System.out.println("How many students grades are being put in:");
		int numstudents = input.nextInt();
		
		try {
			stats = new File(file);
			out = new FileWriter(stats);
			writeFile =  new BufferedWriter(out);
			
			for (int i = 0; i < numstudents; i++) 
				{	
				System.out.println("What is the students name:");
				name = input.next();
				
				System.out.println("Enter the test score:");
				score = input.next();
				
				writeFile.write(name + "'s test grade is a " + score);
				writeFile.newLine();
				
				numScore += 1;
				totalscore += Double.parseDouble(score);
				avescore = totalscore/ numScore;
				}
			writeFile.write("\n" + "Test average = " + avescore);

			
			writeFile.close();
			out.close();
			System.out.println("Data has been written to the file");
		}
		catch (IOException e) 
		{
			System.out.println("Problem with input/output");
			System.err.println("IOException: " + e.getMessage());
		}
		
		try
		{
				stats = new File(file);
				FileReader in;
				BufferedReader readFile;
				in = new FileReader(stats);
				readFile =  new BufferedReader(in);
				
				
				while ((name = readFile.readLine()) != null) 
				{
					score = readFile.readLine();
				}
				readFile.close();
				in.close();
			
				
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
		