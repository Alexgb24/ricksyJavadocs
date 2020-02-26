package ricksy.business;

import ricksy.business.CreditCard;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 3;
	private final int itemcost = 50;
	

	CrystalExpender(int stock, int itemcost) {
		this.stock = stock;
		this.itemcost = itemcost;
	}

	public void dispatch(CreditCard crecard) {
		if (crecard.credit >= itemcost) {
			this.stock -= 1; }	
		else {
			this.stock = this.stock - 0; }
		if (stock > 0) {
			crecard.credit = crecard.credit - itemcost; }
		else {
			crecard.credit = crecard.credit - 0;
			this.stock = 0; }
		
	}	
	public int stock() {
		return this.stock;
	}
		
	/**
	 * No he podido comprobar si compila
	 */

	@Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("owner=" + owner);
        information.append(", number=" + number());
        information.append(", credit=" + credit());
        information.append(", Packs=" + stock());
        return information.toString();
}

