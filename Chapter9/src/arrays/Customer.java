package arrays;

public class Customer {
		private String firstName, lastName;

		//create String variables street, city, province, postal code	

		
		public Customer(String fName, String lName) //modify constructor to include street, city, province, postal code
		{
			firstName = fName;
			lastName = lName;

			//reflect the changes in the parameter
		}
		

		//create changeCity method that asks the user their city and records city in a variable above

		//create changeStreet method that asks the user their street and records street in a variable above

		//create changeProvince method that asks the user their province and records province in a variable above

		//create changePostalCode method that asks the user their postal code and records postal code in a variable above

		public String toString() {
			String custString;

			//update this string so that it contains the street, city, province, and postal code
			custString = firstName + " " + lastName + "\n";
		 	return(custString);
		}

	}


