package Account;

public class BusinessAccount extends Account{
	
	
	public BusinessAccount(String fName, String lName, double bal) 
	{
		super(fName,lName, bal);
		
		if (balance < 500) 
		{
			System.out.println("$10 will be charged");
			balance = (balance - 10);
			
		}
	}
	
	
	
	//p
	
	
	
	
	
	
	public String toString()
	{
		return(super.toString() + " your balance is $" + balance);
	}

}
