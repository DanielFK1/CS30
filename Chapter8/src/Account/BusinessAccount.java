package Account;

public class BusinessAccount extends Account{
	
	double withdraw;
	
	public BusinessAccount(String fName, String lName,String add, String cy, String pvince,double bal,double depo,double with)
	{
		super(fName,lName,add,cy,pvince, bal, depo,with);
		balance = bal;
		withdraw = with;
		
		
		//if (balance < 500) 
		//{
			//System.out.println("$10 will be charged");	
			//balance = (balance - 2);
		//}
		
	}
	
	
	
	
	public String toString()
	{
		if (balance < 500)
		{
			System.out.println("Two dollars will be charged");
			balance = (balance - 10);
			return("You deposited $" + deposit + " into your account and withdrew $" + withdraw 
					+ " Due to the fact that your balance is below $500 "
					+ "we have deducted $10 your balance is now $" + balance);
		}

		return(super.toString());
	}

}
