package FindAndReplace;

import java.io.*;
import java.util.Scanner;

public class Roster{
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		String name;
		File stuname;
		FileWriter out;
		BufferedWriter writeFile;
		String score = null;
		Scanner input = new Scanner(System.in);
		//Ask the file name
		System.out.println("What is the file name:");
		String file = input.next();
		
		//Ask how many students
		System.out.println("How many students are in the class:");
		int numstu = input.nextInt();
		
		
		try {
			stuname = new File(file);
			out = new FileWriter(stuname);
			writeFile =  new BufferedWriter(out);
			
			for (int i = 0; i < numstu; i++) 
				{	
				System.out.println("What is the students name:");
				name = input.next();
				
				writeFile.write(name);
				writeFile.newLine();
				
				}	
				
				out.close();
				writeFile.close();
				System.out.println("Data has been added");
				}
				
				catch (IOException e) 
				{	
					System.out.println("Problem with input/output");
					System.err.println("IOException: " + e.getMessage());
				}
		
				
			try {
				stuname = new File(file);
				FileReader in;
				BufferedReader readFile;
				in = new FileReader(stuname);
				readFile =  new BufferedReader(in);
				
				name = readFile.readLine();
				
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
