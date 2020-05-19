package ricksy.business;

public class CreditCard {
	

	private String owner = null;
	public String number = null;
	public double credit = 3000d;
	private String symbol = "EZI";
	
	String creditstr = String.valueOf(credit);
	
	/**
	 * constructor
	 */
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}
	/**
	 * getters
	 */
	public String getOwner() {
		return owner;
	}

	public String number() {
		return number;
	}

	public double credit() {
		return credit;
	}
	/**
	 * El metodo pay comprueba si la persona puede pagar o no
	 * @param credit es el credito total de la persona, el dinero que tiene
	 * @return true si tiene credito para pagar
	 * @return false si no tiene credito para pagar 
	 */
	
	public boolean pay(double payment) {
		if (credit >= payment) {
			this.credit -= payment; 
			return true;}
		else {}
			return false;
	}
	
	
    @Override
    public String toString() {
        StringBuilder creditcard = new StringBuilder();
        creditcard.append("owner=" + owner);
        creditcard.append(", number=" + number);
        creditcard.append(", credit=" + credit + symbol);
        return creditcard.toString();
    }
}


