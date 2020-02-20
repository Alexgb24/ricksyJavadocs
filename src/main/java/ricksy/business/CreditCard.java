package ricksy.business;

public class CreditCard {
	

	private String owner = null;
	private String number = null;
	private double credit = 3000d;
	private String symbol = EZI;
	

	public CreditCard(String owner, String number) {
		this.owner = owner;
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public String number() {
		return number;
	}

	public double credit() {
		return credit;
	}
	
	public boolean pay(double payment) {
		if (credit - payment != credit)
			return true;
		else
			return false;
	}
	
    @Override
    public String toString() {
        StringBuilder creditcard = new StringBuilder();
        creditcard.append("owner=" + getOwner());
        creditcard.append(", number=" + number());
        creditcard.append(", credit=" + credit());
        return creditcard.toString();
    }
}
