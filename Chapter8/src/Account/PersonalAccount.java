package Account;

public class PersonalAccount extends Account{
	
	public PersonalAccount(String fName, String lName,String add, String cy, String pvince,double bal) 
	{
		super(fName,lName,add,cy,pvince, bal); 
	}
	
	

	public String towithDraw(double amt)
	{
		if (amt < super.getBalance())
		{
			super.withDraw(amt);
			
			if(super.getBalance() < 100) 
			{
				super.withDraw(2);
				return(super.toString() + "There has been a charge of 2 dollars");
			}
			else
			{
				System.out.println("You don't have enoguh money in the account");
			}
			
		}
		return(super.toString());
	}

}

