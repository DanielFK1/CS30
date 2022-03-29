package Account;



public class Account 
{
	
	private String firstName, lastName;
	double deposit;
	double balance;
	double withdraw;
	
	public Account(String fName, String lName, double bal, double depo, double with) 
	{
		firstName = fName;
		lastName = lName;
		balance = bal;
		deposit = depo;
		withdraw = with;
		balance = (balance + deposit - withdraw);
		
		
	}
	
    public String toString()
    {
        return(firstName+" "+ lastName + " you deposited $" + deposit + 
        		" now your balance is $" + balance);
    }
}