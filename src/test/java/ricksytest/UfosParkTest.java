package edu.elsmancs.ricksytest.domain;


import org.junit.Test;
import static org.junit.Assert.*;



public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
    	UfosPark ufos = new UfosPark();
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de crédito.
     * El crédito de la tarjeta varía.
     */
    @Test
    public void dispatchTest() {
    	UfosPark ufos = new UfosPark();
    	CreditCard crecard = new CreditCard("Abradolph", "482948193");
    	ufos.add("dox");
    	ufos.dispatch(crecard);
    	assertEquals("dox", ufos.getUfoOf(crecard.number));
    	
    	
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {
    	UfosPark ufos = new UfosPark();
    	CreditCard crecard = new CreditCard("Abradolph", "482948193");
    	ufos.add("dox");
    	crecard.pay(3000);
    	ufos.dispatch(crecard);
    	assertEquals(null, ufos.getUfoOf(crecard.number));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    	UfosPark ufos = new UfosPark();
    	CreditCard crecard = new CreditCard("Abradolph", "482948193");
    	ufos.add("dox");
    	ufos.dispatch(crecard);
    	assertEquals("dox", ufos.getUfoOf(crecard.number));
    	ufos.add("trex");
    	ufos.dispatch(crecard);
    	assertEquals("dox", ufos.getUfoOf(crecard.number));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    	UfosPark ufos = new UfosPark();
    	CreditCard crecard = new CreditCard("Abradolph", "482948193");
    	ufos.add(null);
    	ufos.dispatch(crecard);
    	assertEquals(null, ufos.getUfoOf(crecard.number));
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    	UfosPark ufos = new UfosPark();
    	CreditCard crecard = new CreditCard("Abradolph", "482948193");
    	ufos.add("dox");
    	ufos.dispatch(crecard);
    	assertEquals("dox", ufos.getUfoOf(crecard.number));
    }
}
