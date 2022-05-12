package arrays;

public class Customer {
		private String firstName, lastName,street,city,province,postalcode;
		
		public Customer(String fName, String lName, String s, String cty, String prov, String pcode) //modify constructor to include street, city, province, postal code
		{
			firstName = fName;
			lastName = lName;
			street = s;
			city = cty;
			province = prov;
			postalcode = pcode;
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


