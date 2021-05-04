package Concrete;

import Abstract.CustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		return false; //Denemek için false gönderildi.True gönderilir ise test başarılı olur.
	}

	

}
