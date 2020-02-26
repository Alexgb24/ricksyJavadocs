package ricksy.business;

import java.util.ArrayList;

public class Receptivo {
	
	ArrayList<GuestDispatcher> guests = new ArrayList<GuestDispatcher>();
	
	public Receptivo() {
		
	}
	public void registra(GuestDispatcher gestDispatcher) {
		this.guests.add(gestDispatcher);
	}
	
	public ArrayList<GuestDispatcher> getGuest(){
		return this.guests;
	}
	public void dispatch(CreditCard crecard) {
		for (GuestDispatcher object: guests) {
			object.dispatch(crecard);
		}
		
	}
	
}
