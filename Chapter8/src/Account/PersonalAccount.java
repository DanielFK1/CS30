package Account;

public class PersonalAccount extends Account{
	
	double withdraw;
	
	public PersonalAccount(String fName, String lName,String add, String cy, String pvince,double bal,double depo,double with) 
	{
		super(fName,lName,add,cy,pvince, bal,depo,with);
		balance = bal;
		withdraw = with; 
	}
	
	

	public String toString()
	{
		if (balance < 100)
		{
			System.out.println("Two dollars will be charged");
			balance = (balance - 2);
			return("You deposited $" + " into your account and withdrew $" + withdraw 
					+ " Due to the fact that your balance is below $100 "
					+ "we have deducted $2 your balance is now $" + balance);
		}
		
		return(super.toString());
	}

}

