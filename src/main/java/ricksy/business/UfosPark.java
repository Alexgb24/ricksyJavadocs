package ricksy.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UfosPark implements GuestDispatcher {
	
	private double fee = 500d;
	private ArrayList<String> flota = new ArrayList<String>();
	private ArrayList<String> ufos = new ArrayList<String>(); 
	private Map<String, String> ufoasignado = new HashMap <String, String>();

	
	
	/** Recorre el HashMap, si ovni es igual a "null" significa que no esta asignado, entonces llama al metodo pay, 
	 * si tiene dinero paga y se le asigna el ovni, si no lo ignora
	 * Una persona no puede tener varios ovnis asignados
	 * 
	 * @param fee Es el coste del ovni
	 * @param flota Es el mapa donde se guardan los ovnis
	 * @see creditCard La tarjeta de credito de la persona
	 */
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
	/** Devuelve un ovni asignado al invitado
	 * 
	 * @return devuelve el ovni del nombre elegido, si no tiene ovni devuelve null
	 */
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
	
	/** Añade un ovni en el map flota
	 * 
	 * @param flota Es el map donde se guardan los ovnis con sus ID
	 */
	public void add(String idovni) {
		this.flota.add(idovni);
		this.ufos.add(idovni);
	}

}