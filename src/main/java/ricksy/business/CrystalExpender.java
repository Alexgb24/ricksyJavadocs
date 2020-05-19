package ricksy.business;

import ricksy.business.CreditCard;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 3;
	private double itemcost = 50d;
	
	/** 
	 * Constructor 
	 */
	CrystalExpender(int stock, double itemcost) {
		this.stock = stock;
		this.itemcost = itemcost;
	}
	/** El metodo dispatch comprueba si tiene hay creditos en la tarjeta de credito
	 * si tiene creditos, comprueba si hay paquetes en el stock
	 * y resta al creditcard el precio de el stock
	 *  
	 *  @param itemcost es el precio del objeto
	 *  @param stock es el total de paquetes disponibles
	 *  @see creditCard Comprueba la tarjeta de credito de la persona
	 */

	public void dispatch(CreditCard crecard) {
		if (crecard.credit >= itemcost) {
			this.stock -= 1; 
			if (stock > 0) {
				crecard.credit = crecard.credit - itemcost; 
			}
		}
		
	}	
	/** 
	 * @return Muestra la cantidad que hay en stock
	 */
	public int stock() {
		return this.stock;
	}
		

	@Override
	public String toString() {
		return "Stock: " + stock + "\n" + "cost: " + itemcost;
	}
}