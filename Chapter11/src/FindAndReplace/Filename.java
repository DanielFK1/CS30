package FindAndReplace;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filename {
	
	public static void main(String[] args) 
	{
		//File FindandReplace = new File("ReplaceandFind.txt");
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the file name:");
		String filename = input.nextLine();
		File name = new File(filename + ".txt");
		
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

