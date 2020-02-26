package ricksy.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ricksy.business.CreditCard;

public class UfosPark implements GuestDispatcher {
	
	private int fee = 500;
	private ArrayList<String> flota = new ArrayList<String>();
	private HashMap<String, String> ufoasignado = new HashMap<String, String>();

	public void add(String ovni) {
		flota.add(ovni);
		
	}

	public void dispatch(CreditCard crecard) {
		for (String ovni: flota) {
			if (ovni == null) {
				flota.remove(ovni);
				this.credit -= fee;
			}
		
	}
		
		
	}

	public String getUfoOf(String number) {
		for (String key : ufoasignado.keySet())
		return ufoasignado.get(number);
		return number;
	}

}
