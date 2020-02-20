package ricksy.business;

import java.util.HashMap;
import java.util.List;
import ricksy.business.CreditCard;

public class UfosPark implements GuestDispatcher {
	
	private String fee = null;
	private List<Object> flota = null;
	HashMap<CreditCard, String> ufoasignado = new HashMap<CreditCard, String>();

	public void add(String ovni) {
		flota.add(ovni);
		
	}

	public void dispatch(CreditCard crecard) {
			if 
		
	}


	public String getUfoOf(CreditCard crecard) {
		for (CreditCard credcard : ufoasignado.getValue()) {
			return ufoasignado.get(crecard);
		}
		
		
	}

}
