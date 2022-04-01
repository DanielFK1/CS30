package Account;



public class Account 
{
	
	private String firstName, lastName;
	double deposit;
	double balance;
	double withdraw;
	
	public Account(String fName, String lName,String add, String cy, String pvince, double bal) 
	{
		firstName = fName;
		lastName = lName;
		balance = bal;
		//deposit = depo;
		//withdraw = with;
		balance = (balance + deposit - withdraw);
		
		
	}
	
    public String toString()
    {
    	return(firstName+" "+ lastName + " lives on " + address + " " + city + "," + province );
        /*return(firstName+" "+ lastName + " you deposited $" + deposit 
        		+ " and withdrew $" + withdraw + " now your balance is $" + balance); */
    }
}