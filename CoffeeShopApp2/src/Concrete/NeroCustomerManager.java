package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	CustomerCheckService CustomerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {

		CustomerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (CustomerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Doğrulanamadı");
		}

	}
}
