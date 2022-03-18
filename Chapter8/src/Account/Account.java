package Account;



public class Account {
	
	//private class Customer
	
	private String firstName, lastName;
	double deposit;
	double balance;
	
	public Account(String fName, String lName, double bal, double depo) 
	{
		firstName = fName;
		lastName = lName;
		balance = bal;
		deposit = depo;
		
		balance = (balance + deposit);
		
	}
	
    public String toString()
    {
        return(firstName+" "+ lastName + " you deposited $" + deposit + 
        		" now your balance is $" + balance);
      
    }
}