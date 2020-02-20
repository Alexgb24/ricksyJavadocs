package ricksy.business;

import java.util.List;
import ricksy.business.CreditCard;

public class Receptivo {
	List<CrystalExpender> crystalregister = null;
	List<UfosPark> uforegister = null;
	
	public void dispatch(CreditCard crecard) {
		crecard.pay(payment);
		
	}
	public void registra(CrystalExpender packExpender) {
		crystalregister.add(packExpender);
	}
	public void registra(UfosPark ufosPark) {
		uforegister.add(ufosPark);
		
		
	}
}
