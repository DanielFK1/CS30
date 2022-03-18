package Account;

public class BusinessAccount extends Account{
	
	
	public BusinessAccount(String fName, String lName,double bal, double depo) 
	{
		super(fName,lName, bal, depo);
		
		if (deposit < 500) 
		{
			System.out.println("$10 will be charged");
			deposit = (deposit - 10);
			
		}
	}
	
	
	
	//p
	
	
	
	
	
	
	public String toString()
	{
		return(super.toString() + " your balance is $" + deposit);
	}

}
