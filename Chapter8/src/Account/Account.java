package Account;



public class Account 
{
	double balance;
	double deposit;
	double withdraw;
	
	private Customer c;
	
	public Account(String fName, String lName,String add, String cy, String pvince, double bal, double depo,double with) 
	{		
		c = new Customer(fName, lName, add, cy, pvince);
		
		balance = bal;
		deposit = depo;
		withdraw = with;
		
	}
	
    public String toString()
    {
    	balance = (balance + deposit - withdraw);
    	return("You deposited $" + deposit + " into your account and withdrew $" + withdraw + ", your balance is now $" + balance);
    }
}