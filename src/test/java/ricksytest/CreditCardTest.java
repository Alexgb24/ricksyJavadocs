package ricksytest;

import static org.junit.Assert.*;

import ricksy.business.CreditCard;

public class CreditCardTest {
	
	private String owner = null;
	private String number = null;
	private double credit = 3000d;
	private String symbol = null;


	
	@test
	
	public void payTest() {
		CreditCard crecard = new CreditCard("Abradoplh", "4916119711304546" );
		crecard.pay(500);
		
	}
	
	@test
	
	public void toStringTest () {
		CreditCard crecard = new CreditCard("Abradoplh", "4916119711304546" );
		
	}
	
}
