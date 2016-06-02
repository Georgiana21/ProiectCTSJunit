package ichim.proiect.cts.junit;

import ichim.proiect.cts.Carte;
import ichim.proiect.cts.ExceptieProdusInexistent;
import ichim.proiect.cts.Film;
import ichim.proiect.cts.Magazin;
import ichim.proiect.cts.Muzica;
import ichim.proiect.cts.Produs;
import ichim.proiect.cts.TipProdus;
import junit.framework.TestCase;

public class TestMagazinGetProdus extends TestCase {
	
	Magazin magazin;

	public TestMagazinGetProdus(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		magazin=Magazin.getInstantaMagazin();
	}
	
	public void testFilm(){
		try {
			Produs produs=magazin.getProdus(TipProdus.FILM, "film", 111);
			Film film=new Film("film",111);
			assertNotNull("Verificare referinta produs",produs);
			assertEquals("Verificare denumire film",film.getDenumire(),produs.getDenumire());
			assertEquals("Verificare pret film",film.getPret(),produs.getPret());
			assertEquals("Verificare clasa produs",film.getClass(),produs.getClass());
		} catch (ExceptieProdusInexistent e) {

		}
	}
	
	public void testCarte(){
		try {
			Produs produs=magazin.getProdus(TipProdus.CARTE, "carte", 111);
			Carte carte=new Carte("carte",111);
			assertNotNull("Verificare referinta produs",produs);
			assertEquals("Verificare denumire film",carte.getDenumire(),produs.getDenumire());
			assertEquals("Verificare pret film",carte.getPret(),produs.getPret());
			assertEquals("Verificare clasa produs",carte.getClass(),produs.getClass());
		} catch (ExceptieProdusInexistent e) {

		}
	}
	
	public void testMuzica(){
		try {
			Produs produs=magazin.getProdus(TipProdus.MUZICA, "muzica", 111);
			Muzica muzica=new Muzica("muzica",111);
			assertNotNull("Verificare referinta produs",produs);
			assertEquals("Verificare denumire film",muzica.getDenumire(),produs.getDenumire());
			assertEquals("Verificare pret film",muzica.getPret(),produs.getPret());
			assertEquals("Verificare clasa produs",muzica.getClass(),produs.getClass());
		} catch (ExceptieProdusInexistent e) {

		}
	}
	
	public void testNull(){
		try {
			Produs produs=magazin.getProdus(null, "film", 111);
			fail("Tip produs null");
		} catch (ExceptieProdusInexistent e) {

		}
	}
	
	public void testJoc(){
		try {
			Produs produs=magazin.getProdus(TipProdus.JOC, "joc", 111);
			fail("Tip produs neimplementat");
		} catch (ExceptieProdusInexistent e) {
			
		}
	}

}
