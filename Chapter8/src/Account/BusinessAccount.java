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
			System.out.println("$10 will be charged");
			balance = (balance - 10);
		}
	}
	
	public String toString()
	{
		return(super.toString() + " your balance is $" + balance);
	}

}
