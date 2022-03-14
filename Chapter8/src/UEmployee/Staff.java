package UEmployee;

public class Staff extends Employee {
	
	String jobtitle;
	
	public Staff(String fName, String lName, double salary,String title) 
	{
		super(fName,lName,salary);
		jobtitle = title;
	}
	
	public String toString() 
	{
		return(super.toString() + " and works as a " + jobtitle);
	}
}
