package FindAndReplace;

import java.io.Serializable;

public class StuName implements Serializable 
{
	//declare private 
	String name;
    private String firstname;
    private String lastname;

	//create the constructor for the two names
	public StuName(String fn,String ln) 
	{	
		firstname = fn;
		lastname = ln;
	}
	
	//create the toString for the first and last name
	public String toString() {
		name = firstname + " " + lastname;
		return(name + "\n");
		
	}
}

