package FindAndReplace;

import java.io.*;
import java.util.Scanner;

public class Roster {
	
	public static void main(String[] args) 
	{
		File stuname = new File ("studentsname.txt");
		
		try {
			FileOutputStream out = new FileOutputStream(stuname);
			ObjectOutputStream writestu = new ObjectOutputStream(out);
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("What is the students first name:");
			String firstname = input.nextLine();
			
			System.out.println("What is the students last name:");
			String lastname = input.nextLine();	
			String name = (firstname + lastname);
			
			
			System.out.println("How many students are in the class:");
			int numstu = input.nextInt();
			
			writestu.writeObject(name);
			writestu.close();
			
			}
			
			catch (FileNotFoundException e) 
			{
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
