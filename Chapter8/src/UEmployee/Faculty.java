package UEmployee;

public  class Faculty extends Employee {
	
	String departmentname;
	
	public Faculty(String fName,String lName,double salary,String dname ) 
	{
		super(fName,lName,salary);
		departmentname = dname;
	}
	
	public String toString() 
	{
		return(departmentname);
	}
}
