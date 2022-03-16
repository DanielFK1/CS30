package Account;

public class PersonalAccount extends Customer{
	
	String Personal;
	double balance;
	
	public PersonalAccount(String fName, String lName, double bal) 
	{
		super(fName,lName);
		balance = bal;
	}
	
	public String toString()
	{
		return(super.toString() + " " + balance);
	}

}

