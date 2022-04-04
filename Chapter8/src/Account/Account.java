package Account;



public class Account 
{
	double balance;
	double deposit;
	
	private Customer c;
	
	public Account(String fName, String lName,String add, String cy, String pvince, double bal, double depo) 
	{		
		c = new Customer(fName, lName, add, cy, pvince);
		
		balance = bal;
		deposit = depo;
		
		balance = (balance + deposit);
		
	}
	
    public String toString()
    {
    	return("You deposited $" + deposit + " into your account," + " your balance is now $" + balance);
    }
}