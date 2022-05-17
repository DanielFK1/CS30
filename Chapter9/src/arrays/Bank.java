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
			String fName, lName,s,cty,prov,pcode;

			Scanner input = new Scanner(System.in);
			
			System.out.print("First name: ");
			fName = input.nextLine();

			System.out.print("Last name: ");
			lName = input.nextLine();
			
			System.out.print("Street: ");
			s = input.nextLine();

			System.out.print("City: ");
			cty = input.nextLine();

			System.out.print("Province: ");
			prov = input.nextLine();

			System.out.print("Postal code: ");
			pcode = input.nextLine();



			System.out.print("Beginning balance: ");
			bal = input.nextDouble();
			
			newAcct = new Account(bal, fName, lName,s,cty,prov,pcode);
			accounts.add(newAcct);
			
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
		 		accounts.remove(acctIndex);
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
		 	acctIndex = accounts.indexOf(acctToMatch);	
		 	if (acctIndex > -1) 
		 	{
		 		acct = accounts.get(acctIndex);				
		 		if (transCode == 1) {
		 			acct.deposit(amt);
		 			accounts.set(acctIndex, acct);		
		 			System.out.println(acct);
		 		} else if (transCode == 2) {
		 			acct.withdrawal(amt);
		 			accounts.set(acctIndex, acct);		
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
		 	acctIndex = accounts.indexOf(acctToMatch);
		 	if (acctIndex > -1) 
		 	{
		 		acct = accounts.get(acctIndex);
		 		System.out.println(acct);
		 	} else 
		 	
		 	{
		 		System.out.println("Account does not exist.");
		 	}
		}

		public void modifyAccount(String acctID) 
		{
			int acctIndex = 0;
			Account acct,acctToMatch;
		 	
			acctToMatch = new Account(acctID);
		 	acctIndex = accounts.indexOf(acctToMatch);
			
			if(acctIndex > -1) 
				{
					acct = accounts.get(acctIndex);
					String s,cty,prov,pcode;

					Scanner input = new Scanner(System.in);
					
					System.out.print("New Street: ");
					s = input.nextLine();

					System.out.print("New City: ");
					cty = input.nextLine();

					System.out.print("New Province: ");
					prov = input.nextLine();

					System.out.print("New Postal code: ");
					pcode = input.nextLine();
					
					acct.changeAddress(s,cty,prov,pcode);
					
					System.out.println(acct);
				}

			else
				{
					System.out.print( "Account does not exits" + "\n");
				}	


		}

			
	}
