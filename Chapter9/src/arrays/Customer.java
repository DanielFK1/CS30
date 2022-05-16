package arrays;

public class Customer {
		private String firstName, lastName,street,city,province,postalcode;
		
		public Customer(String fName, String lName, String s, String cty, String prov, String pcode)
		{
			firstName = fName;
			lastName = lName;
			street = s;
			city = cty;
			province = prov;
			postalcode = pcode;
		}
		

		public void changeCity(String cty)
			{
				city = cty;
			}
		
		public void changeStreet(String s)
			{
				street = s;
			}
		
		public void changeProvince(String prov)
			{
				province = prov;
			}
		
		public void changePostalCode(String pcode)
			{
				postalcode = pcode;
			}

		public String toString() {
			String custString;

			custString = firstName + " " + lastName + " " + street + " " + city + " " + province + " " + postalcode +  "\n";
		 	return(custString);
		}
		
	}


