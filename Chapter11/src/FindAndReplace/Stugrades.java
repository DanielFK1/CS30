package FindAndReplace;

import java.io.Serializable;

public class Stugrades implements Serializable 
{
	private String firstname;
	private String lastname;
	private int stugrades;
	private float totalgrade;
	private float counter;
	float average = 0;
	
	public Stugrades(String fname, String lname,int grades,float tgrade,float counte) 
	{	
		firstname =  fname;
		lastname = lname;
		stugrades = grades;
		totalgrade = tgrade;
		counter = counte;
		
		average = totalgrade/counter;
	}
	
	public String toString() {
		return(firstname + " " + lastname + ": " + stugrades + "\n" + "The Class average is:" + average);
	}
}
