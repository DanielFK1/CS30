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


public class Stats {
	public static void main(String[] args)
	{
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
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
				System.out.println("What is the students first name:");
				String firstname = input.next();
				
				System.out.println("What is the students last name:");
				String lastname = input.next();	
				
				System.out.println("Enter the test score:");
				int stugrades = (int) input.nextFloat();
				
				totalgrade += stugrades;
				counter = numstudents;
				highestmark = Math.max(highestmark, stugrades);
				lowestmark = Math.min(lowestmark, stugrades);
						
				(writeFile).write(new Stugrades(firstname,lastname,stugrades,totalgrade,counter,highestmark,lowestmark));
				}	
				
				writeFile.close();
				out.close();
				
				System.out.println("Data has been added");
				
				in = new FileReader(stats);
				readFile =  new BufferedReader(in);
				
				for (int i = 0; i < numstudents; i++) 
				{
					System.out.print((Stugrades)(readFile).readObject());
				}
				readFile.close();
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
			catch (ClassNotFoundException e)
			{
				System.out.println("Class could not be used to cast object");
				System.err.println("ClassNotFoundException: " + e.getMessage());
			}
	}
}
