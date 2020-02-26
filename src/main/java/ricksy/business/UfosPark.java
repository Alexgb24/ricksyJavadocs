package ricksy.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
	
	private double fee = 500d;
	private ArrayList<String> flota = new ArrayList<String>();
	private ArrayList<String> ufos = new ArrayList<String>(); 
	private Map<String, String> ufoasignado = new HashMap <String, String>();

	public void dispatch(CreditCard crecard) {
		if (this.getUfoAsignado().containsKey(crecard.number())) {
			
		}
		else {
			if (crecard.credit() >= this.fee && this.flota.size() > 0 ) {
				crecard.pay(fee);
				this.ufoasignado.put(crecard.number(), this.flota.remove(0));
			}
		}
		
	}
	
	public String getUfoOf(String nombre) {
		return this.ufoasignado.get(nombre);
	}
	public String toString(){
		return ufos.toString();
	}
	
	public Map<String, String> getUfoAsignado(){
		return this.ufoasignado;
	}
	
	public ArrayList<String> getFlota(){
		return flota;
	}
	
	public void add(String idovni) {
		this.flota.add(idovni);
		this.ufos.add(idovni);
	}

}
