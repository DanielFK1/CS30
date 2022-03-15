package Account;

public class Customer 
{
	private String firstName, lastName;
	double balance;
	
    public Customer(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
   
    public String toString()
    {
        return(firstName+" "+ lastName);
    }
    
}
