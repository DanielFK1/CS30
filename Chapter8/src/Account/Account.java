package Account;

import java.text.NumberFormat;

public class Account 
{
	double balance;
	
	private Customer c;
	
	public Account(String fName, String lName,String add, String cy, String pvince, double bal, double depo,double with) 
	{		
		c = new Customer(fName, lName, add, cy, pvince);
		
		balance = bal;
	}
	
    public double getBalance() 
    {
    	return(balance);
    }
    
    public void deposit(double amt)
    {
    	balance += amt;
    }
    
    public void withDraw(double amt)
    {
    	if (amt <= balance) 
    	{
    		balance -= amt;
    	}
    	else {
    		System.out.println("Not enough money in account");
    	}
    }
    
    public String toString()
    {
    	String accountString;
    	NumberFormat money = NumberFormat.getCurrencyInstance();
    	accountString = c.toString();
    	accountString += "Current balance is " + money.format(balance);
    	return(accountString);
    }
}