package Account;

public class BusinessAccount extends Account{
	

	
	public BusinessAccount(String fName, String lName,String add, String cy, String pvince,double bal)
	{
		super(fName,lName,add,cy,pvince, bal);
		balance = bal;
	}
	
	public void towithDraw(double amt)
	{
		if (amt < super.getBalance() - 10)
		{
			super.withDraw(amt);
			
			if(super.getBalance() < 500) 
			{
				super.withDraw(10);
				System.out.println("There has been a charge of 10 dollars");
			}
			else
			{
				System.out.println("You don't have enoguh money in the account");
			}
		}
		
	}

}
