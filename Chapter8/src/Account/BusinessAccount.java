package Account;

public class BusinessAccount extends Account{
	
	
	public BusinessAccount(String fName, String lName,double bal, double depo,double with) 
	{
		super(fName,lName, bal, depo,with);
		deposit = depo;
		withdraw = with;
		
		
		
		if (balance < 500) 
		{
			System.out.println("$10 will be charged");		
		}
		
	}
	
	
	
	//p
	
	
	
	
	
	
	public String toString()
	{
		if (balance < 500) 
		{
			System.out.println("$10 will be charged");
			balance = (balance - 10);
			
		}
		return(super.toString() + " your balance is $" + balance);
	}

}
