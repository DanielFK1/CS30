
package arrays;

import java.text.NumberFormat;

public class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
	public Account(double bal, String fName, String lName, String s,String cty,String prov, String pcode)
	 {
		balance = bal;
		cust = new Customer(fName, lName, s, cty, prov, pcode);
		acctID = fName.substring(0,1) + lName;
	}
	

	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}


	public String getID() {
	 	return(acctID);
	}

	public double getBalance() {
	 	return(balance);
	}


	public void deposit(double amt) {
	 	balance += amt;
	}

	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}

	public void changeAddress(String s,String cty,String prov,String pcode)
	{
		cust.changeStreet(s);
		cust.changeCity(cty);
		cust.changeProvince(prov);
		cust.changePostalCode(pcode);
	}

	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}

	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
	 	return(accountString);
	}
	}

