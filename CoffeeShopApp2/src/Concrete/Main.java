package Concrete;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "MERT", "UĞRAŞ", 1990, "12345566");
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer);

		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager(new CustomerCheckManager());
		baseCustomerManager2.save(customer);
	}

}
