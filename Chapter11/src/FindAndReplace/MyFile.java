package FindAndReplace;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFile {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the file name:");
		String filename = input.nextLine();
		File name = new File(filename);
		
		try {
			Scanner Filereader = new Scanner(name);
			Filereader.close();
			}
	
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
}
}
