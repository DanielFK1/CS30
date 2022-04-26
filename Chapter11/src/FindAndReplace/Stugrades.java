package FindAndReplace;

import java.io.Serializable;

public class Stugrades implements Serializable 
{
	private String firstname;
	private String lastname;
	private int stugrades;
	
	public Stugrades(String fname, String lname,int grades) 
	{	
		firstname =  fname;
		lastname = lname;
		stugrades = grades;
	}
	
	public String toString() {
		return(firstname + " " + lastname + ": " + stugrades + "\n");
	}
}
