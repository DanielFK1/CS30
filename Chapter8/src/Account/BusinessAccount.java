package Account;

public class BusinessAccount extends Customer{
	
	String Business;
	
	public BusinessAccount(String fName, String lName) 
	{
		super(fName,lName);
	}
	
	public String toString()
	{
		return(super.toString());
	}

}
