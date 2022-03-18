package Account;

public class PersonalAccount extends Account{
	
	public PersonalAccount(String fName, String lName, double bal, double depo) 
	{
		super(fName,lName, bal, depo);
		deposit = depo;
		
		if (deposit < 100)
		{
			System.out.println("Two dollars will be charged");
			deposit = (deposit - 2);
		}
	}
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		return(super.toString() + " your balance is now $" + deposit);
	}

}

