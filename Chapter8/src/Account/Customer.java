package Account;

public class Customer 
{
	private String firstName, lastName;
	private String address,city,province;

	
    public Customer(String fName, String lName, String add,String cy,String pvince)
    {
        firstName = fName;
        lastName = lName;
        address = add;
        city = cy;
        province = pvince;
        
    }
   
    public String toString()
    {
    	String cString;
    	
    	
    	cString = firstName + " " + lastName + "\n";
    	cString += address + "\n";
    	cString += city + "," + province + "\n";
    	return(cString);
    }
    
}
