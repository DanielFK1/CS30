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


public class Roster {
	public static void main(String[] args) throws ClassNotFoundException
	{
		FileWriter out;
		BufferedWriter writeFile;
		String firstname = null;
		String lastname = null;

		
		File students; 
		Scanner input = new Scanner(System.in);

		System.out.println("What is the file name:");
		String file = input.next();
		
		
		System.out.println("How many students names are being put in:");
		int numstudents = input.nextInt();
		
		try {
			students = new File(file);
			out = new FileWriter(students);
			writeFile =  new BufferedWriter(out);
			
			for (int i = 0; i < numstudents; i++) 
				{	
				System.out.println("What is the students firstname:");
				firstname = input.next();
				
				System.out.println("What is the students lastname:");
				lastname = input.next();
				
				writeFile.write(firstname +" " + lastname);
				writeFile.newLine();
				
				}
			
			writeFile.close();
			out.close();
			System.out.println("Data has been written to the file" + "\n");
			
			
		}
		catch (IOException e) 
		{
			System.out.println("Problem with input/output");
			System.err.println("IOException: " + e.getMessage());
		}
		
		try
		{
				students = new File(file);
				FileReader in;
				BufferedReader readFile;
				in = new FileReader(students);
				readFile =  new BufferedReader(in);
				
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
		