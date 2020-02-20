package ricksy.business;

import ricksy.business.CreditCard;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 3;
	private int itemcost = 50;
	

	CrystalExpender(int stock, int itemcost) {
		this.stock = stock;
		this.itemcost = itemcost;
	}

	public void dispatch(CreditCard crecard) {
		if (crecard.credit > itemcost)
			this.stock = this.stock + 1;
		else
			this.stock = this.stock + 0;
		if (stock > 0)
			crecard.credit = crecard.credit - itemcost;
		
	}	
	public int stock() {
		return this.stock;
	}
		
	

	@Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("owner=" + getOwner());
        information.append(", number=" + number());
        information.append(", credit=" + credit());
        information.append(", Packs=" + stock());
        return information.toString();
}

