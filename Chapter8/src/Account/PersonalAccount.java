package Account;

public class PersonalAccount extends Account{
	
	public PersonalAccount(String fName, String lName,String add, String cy, String pvince,double bal) 
	{
		super(fName,lName,add,cy,pvince, bal);
		balance = bal;
		//deposit = depo;
		//withdraw = with;
		
		
		
		if (balance < 100)
		{
			System.out.println("Two dollars will be charged");
			balance = (balance - 2);
		}
	}
	
	

	public String toString()
	{
		return(super.toString() + " your balance is now $" + balance);
	}

}

