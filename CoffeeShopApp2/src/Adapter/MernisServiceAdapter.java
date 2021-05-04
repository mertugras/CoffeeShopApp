package Adapter;



import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		boolean result = false;
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()) ,customer.getName(),
					customer.getLastName(), customer.getDateOfBirthDay());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("1");
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("2");
			e.printStackTrace();
		}
		return result;
	}

}
