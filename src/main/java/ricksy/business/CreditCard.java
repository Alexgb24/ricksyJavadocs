package ricksy.business;

public class CreditCard {
	

	private String owner = null;
	private String number = null;
	double credit = 3000d;
	private String symbol = "EZI";
	
	String creditstr = String.valueOf(credit);
	
	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}

	public void setNumber(String numero) {
		this.number = numero;
	}
	
	public String number() {
		return number;
	}
	
	public boolean pay(double payment) {
		if (credit >= payment) {
			this.credit -= payment; 
			return true;}
		else {}
			return false;
	}
	
	public String credit() {
		return creditstr;
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

