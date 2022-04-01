package Account;

public class BusinessAccount extends Account{
	
	
	public BusinessAccount(String fName, String lName,String add, String cy, String pvince, double bal) 
	{
		super(fName,lName,add,cy,pvince, bal);
		balance = bal;
		//deposit = depo;
		//withdraw = with;
		
		balance = (balance - withdraw);
		
		
		if (balance < 500) 
		{
			System.out.println("$10 will be charged");	
			balance = (balance - 2);
		}
		
	}
	
	
	
	
	public String toString()
	{

		return(super.toString() + " your balance is $" + balance);
	}

}
