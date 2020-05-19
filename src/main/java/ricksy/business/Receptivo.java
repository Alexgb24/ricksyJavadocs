package ricksy.business;

import java.util.ArrayList;

public class Receptivo {
	
	ArrayList<GuestDispatcher> guests = new ArrayList<GuestDispatcher>();
	
	/** Constructor */
	
	public Receptivo() {}
	
	/** Añade el pack a la lista observers 
	 * 
	 * @param guests Es la lista donde se guardan los gestDispatcher
	 * @param gestDispatcher Es el pack que recibiran los invitados en su llegada a la fiesta
	 * */
	public void registra(GuestDispatcher gestDispatcher) {
		this.guests.add(gestDispatcher);
	}
	
	public ArrayList<GuestDispatcher> getGuest(){
		return this.guests;
	}
	/** Por cada persona diferente despachada se le da un pack de bienvenida (gestDispatcher) 
	 * 
	 * @param GuestDispatcher Llama a la interfaz para despachar
	 * @param object Es la persona que llega a la fiesta
	 * @param guests Es la lista donde están guardados los packs de bienvenida (gestDispatcher)
	 * @param crecard es la tarjeta de credito de la persona
	 * @see CreditCard Comprueba la tarjeta de credito
	 * */
	public void dispatch(CreditCard crecard) {
		for (GuestDispatcher object: guests) {
			object.dispatch(crecard);
		}
		
	}
	
}

