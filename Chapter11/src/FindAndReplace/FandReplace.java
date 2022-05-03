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

public class FandReplace 
{
	public static void main(String[] args) throws IOException
	{
	String fileContent = null;
	FileWriter out;
	BufferedWriter writeFile;
	FileReader in;
	BufferedReader readFile;
	String LineofText;
	
	
	File filename, newFile; 
	Scanner input = new Scanner(System.in);

	System.out.println("What is the file name:");
	String file = input.next();
	
	System.out.println("What word or phrase do you want to search:");
	String searchword = input.next();
	
	filename = new File(file);
	
	System.out.println("What is the replacement word or phrase:");
	String replaceword = input.next();
	
	
	try {
			in = new FileReader(filename);
			readFile =  new BufferedReader(in);
	
			file = file.replace(".", "WEN.");
	
			newFile = new File(file);
			out = new FileWriter(filename);
			writeFile =  new BufferedWriter(out);
			 
			while((LineofText = readFile.readLine()) != null) 
			{
				LineofText = LineofText.replaceAll(searchword, replaceword);
				writeFile.write(LineofText);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			in.close();
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


	}
}

