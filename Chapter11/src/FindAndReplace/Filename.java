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
		filename = filename + ".txt";
		File file = new File(filename);
		
		
		
		try {
			Scanner Filereader = new Scanner(filename);
			Filereader.close();
			}
			catch (FileNotFoundException e) 
			{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
			}
	}
}

