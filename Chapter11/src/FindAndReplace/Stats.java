package FindAndReplace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Stats {
	public static void main(String[] args)
	{
		File stats; 
		Scanner input = new Scanner(System.in);

		System.out.println("What is the file name:");
		String file = input.next();
		stats = new File(file + ".txt");
		
		System.out.println("How many students grades are being put in:");
		int numstudents = input.nextInt();
		
		try {
			FileOutputStream out = new FileOutputStream(stats);
			ObjectOutputStream writestu = new ObjectOutputStream(out);
			
			for (int i = 0; i < numstudents; i++) 
				{	
				System.out.println("What is the students first name:");
				String firstname = input.next();
				
				System.out.println("What is the students last name:");
				String lastname = input.next();	
				
				System.out.println("Enter the test score:");
				int stugrades = input.nextInt();
				
				writestu.writeObject(new Stugrades(firstname,lastname,stugrades));
				}	
				
			for (int grades= 0; grades< stugrades; grades++)
				{
					grades += stugrades;
					int Average = grades/numstudents ;
					System.out.println(Average);
				}
				
				out.close();
				writestu.close();
				System.out.println("Data has been added");
				
				FileInputStream in = new FileInputStream(stats);
				ObjectInputStream readstu = new ObjectInputStream(in);
				for (int i = 0; i < numstudents; i++) 
				{
					System.out.print((Stugrades)readstu.readObject());
				}
				readstu.close();
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
