package FindAndReplace;

import java.io.Serializable;

public class Stugrades implements Serializable 
{
	private String firstname;
	private String lastname;
	private int stugrades;
	private float totalgrade;
	private float counter;
	private float highestnumber;
	private float lowestnumber;
	float average = 0;
	
	public Stugrades(String fname, String lname,int grades,float tgrade,float counte,float highest,float lowest) 
	{	
		firstname =  fname;
		lastname = lname;
		stugrades = grades;
		totalgrade = tgrade;
		counter = counte;
		highestnumber = highest;
		lowestnumber = lowest;
		average = totalgrade/counter;
	}
	
	public String toString() {
		return(firstname + " " + lastname + ": " + stugrades + "\n");
	}
}
