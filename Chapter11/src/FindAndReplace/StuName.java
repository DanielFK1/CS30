package FindAndReplace;

import java.io.Serializable;

public class StuName implements Serializable 
{
	//declare private 
	private String firstname;
	private String lastname;

	//create the constructor for the two names
	public StuName(String firstname, String lastname) {	
	}
	
	//create the toString for the first and last name
	public String toString() {
		return(firstname + lastname);
	}
}
