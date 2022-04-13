package FindAndReplace;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filename {
	
	public static void main(String[] args) 
	{
		File FindandReplace = new File("ReplaceandFind.txt");
		try 
		{
			Scanner Find = new Scanner(FindandReplace);
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.print("An error has occurred");
			e.printStackTrace();
		}
	}
}
