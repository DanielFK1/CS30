package UEmployee;

public class Staff extends Employee {
	String jobtitle;
	public Staff(String fName, String lName, String title,double salary) 
	{
		super(fName,lName,salary);
		jobtitle = title;
		//memberstore = storing;
	}
	
	public String tostring() 
	{
		return(super.toString() + jobtitle);
	}
}
