package Account;

public class BusinessAccount extends Customer{
	
	String Business;
	double balance;
	
	public BusinessAccount(String fName, String lName, double bal) 
	{
		super(fName,lName);
		balance = bal;
		
		if (balance < 500) 
		{
			System.out.println("We will add 100");
		}
	}
	
	public String toString()
	{
		return(super.toString() + " " + balance);
	}

}
