package ricksy.business;

import java.util.List;
import ricksy.business.CreditCard;

public class Receptivo implements GuestDispatcher{
	List<CrystalExpender> crystalregister = null;
	List<UfosPark> uforegister = null;
	
	public void dispatch(CreditCard crecard) {
		
	}
	public void registra(CrystalExpender packExpender) {
		crystalregister.add(packExpender);
	}
	public void registra(UfosPark ufosPark) {
		uforegister.add(ufosPark);
		
	}
}
