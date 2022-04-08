package Account;

public class PersonalAccount extends Account{
	
	public PersonalAccount(String fName, String lName,String add, String cy, String pvince,double bal) 
	{
		super(fName,lName,add,cy,pvince, bal); 
	}

	public void withDraw(double amt)
	{
		if (amt < super.getBalance())
		{
			super.withDraw(amt);
			
			if(super.getBalance() < 100) 
			{
				super.withDraw(2);
				System.out.println("\n" + "There has been a charge of 2 dollars");
			}
			else
			{
				System.out.println("\n" + "You don't have enoguh money in the account");
			}
			
		}
	}
}

