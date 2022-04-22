package FindAndReplace;

import java.io.*;
import java.util.Scanner;

public class Roster {
	
	public static void main(String[] args) 
	{
		File stuname; 
		Scanner input = new Scanner(System.in);
		//Ask the file name
		System.out.println("What is the file name:");
		String file = input.next();
		stuname = new File(file + ".txt");
		
		//Ask how many students
		System.out.println("How many students are in the class:");
		int numstu = input.nextInt();
		
		
		try {
			FileOutputStream out = new FileOutputStream(stuname);
			ObjectOutputStream writestu = new ObjectOutputStream(out);
			
			for (int i = 0; i < numstu; i++) 
				{
			//for loop required
			
				System.out.println("What is the students first name:");
				String firstname = input.next();
				
				System.out.println("What is the students last name:");
				String lastname = input.next();	
				
				String name = (firstname + " " + lastname);
				writestu.writeObject(name);
				}	
				
				out.close();
				writestu.close();
				System.out.println("Data has been added");
			}
				
				catch (FileNotFoundException e) 
				{
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + e.getMessage());
				}
				
				catch (IOException e) {
					System.out.println("Problem with input/output");
					System.err.println("IOException: " + e.getMessage());
					}
			
		}
			
	}
