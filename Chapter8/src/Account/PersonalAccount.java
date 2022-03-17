package Account;

public class PersonalAccount extends Customer{
	
	String Personal;
	double balance;
	
	public PersonalAccount(String fName, String lName, double bal) 
	{
		super(fName,lName);
		balance = bal;
		
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

