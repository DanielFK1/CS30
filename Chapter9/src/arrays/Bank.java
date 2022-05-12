package arrays;

import java.util.ArrayList; 
import java.util.Scanner;

public class Bank {
		private ArrayList<Account> accounts;
			
		public Bank() 
		{
			accounts = new ArrayList<Account>();
		}
		
		public void addAccount() 
		{
			Account newAcct;
			double bal;
			String fName, lName;

		//add your string variables for street, city, province, postal code

			Scanner input = new Scanner(System.in);
			
			System.out.print("First name: ");
			fName = input.nextLine();

			System.out.print("Last name: ");
			lName = input.nextLine();


		//get customer street and record street

		//get city 

		//get province

		//get postal code



			System.out.print("Beginning balance: ");
			bal = input.nextDouble();
			
			newAcct = new Account(bal, fName, lName); //update this constructor to include street, city, province, postal code	
											//create acct object
			accounts.add(newAcct);						//add account to bank accounts
			
			System.out.println("Account created. Account ID is: " + newAcct.getID());
		}

		
		public void deleteAccount(String acctID) 
		{
			int acctIndex;
			Account acctToMatch;
			
		 	acctToMatch = new Account(acctID);
		 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
		 	if (acctIndex > -1) 
		 	{
		 		accounts.remove(acctIndex);					//remove account
		 		System.out.println("Account removed.");
		 	} 
		 	
		 	else 
		 	{
		 		System.out.println("Account does not exist.");
		 	}
		}
		

		public void transaction(int transCode, String acctID, double amt) 
		{
			int acctIndex;
			Account acctToMatch, acct;
			
		 	acctToMatch = new Account(acctID);
		 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
		 	if (acctIndex > -1) 
		 	{
		 		acct = accounts.get(acctIndex);				//retrieve object to modify
		 		if (transCode == 1) {
		 			acct.deposit(amt);
		 			accounts.set(acctIndex, acct);		//replace object with updated object
		 			System.out.println(acct);
		 		} else if (transCode == 2) {
		 			acct.withdrawal(amt);
		 			accounts.set(acctIndex, acct);		//replace object with updated object
		 			System.out.println(acct);
		 		}
		 	} 
		 	
		 	else 
		 	{
		 		System.out.println("Account does not exist.");
		 	}
		}

		
		public void checkBalance(String acctID) 
		{
			int acctIndex;
			Account acctToMatch, acct;
			
		 	acctToMatch = new Account(acctID);
		 	acctIndex = accounts.indexOf(acctToMatch);		//retrieve location of account
		 	if (acctIndex > -1) 
		 	{
		 		acct = accounts.get(acctIndex);	//retrieve object to display
		 		System.out.println(acct);
		 	} else 
		 	
		 	{
		 		System.out.println("Account does not exist.");
		 	}

			//Create a modifyAccount(String AcctID) method 
			if(acctIndex > 1) 
				{
				acct = accounts.get..
				acct.changeAddress()
				//print acct to the screen
				}

			else
			{
				print Account does not exits
			}	


	}
}
