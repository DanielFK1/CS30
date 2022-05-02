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
	
	File filename; 
	Scanner input = new Scanner(System.in);

	System.out.println("What is the file name:");
	String file = input.next();
	
	System.out.println("What word do you want to search:");
	String searchword = input.next();
	
	System.out.println("What is the replacement word:");
	String replaceword = input.next();
	
	filename = new File(file);
	FileReader in;
	BufferedReader readFile;
	in = new FileReader(filename);
	readFile =  new BufferedReader(in);
	
	fileContent = fileContent.replaceAll(searchword, replaceword);
	
	filename = new File(file);
	out = new FileWriter(filename);
	writeFile =  new BufferedWriter(out);

	}
}

