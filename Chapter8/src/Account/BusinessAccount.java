package Account;

public class BusinessAccount extends Customer{
	
	String Business;
	double balance;
	
	public BusinessAccount(String fName, String lName, double bal) 
	{
		super(fName,lName);
		balance = bal;
	}
	
	public String toString()
	{
		return(super.toString() + balance);
	}

}
