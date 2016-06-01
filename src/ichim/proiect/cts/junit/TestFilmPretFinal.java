package ichim.proiect.cts.junit;

import ichim.proiect.cts.ExceptiePret;
import ichim.proiect.cts.Film;
import ichim.proiect.cts.Produs;
import junit.framework.TestCase;

public class TestFilmPretFinal extends TestCase {
	
	Produs film;

	public TestFilmPretFinal(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		film=new Film("", 2);
	}
	
	public void testValoriNormale(){
		double valoareNormala=10;
		try {
			film.setPret(valoareNormala);
			assertEquals("Verificare pret final valori normale pentru pret",
					valoareNormala*(1+Produs.TVA) ,film.pretFinal()); 
		} catch (ExceptiePret e) {

		}
	}
	
	
	public void testCapatSuperior(){
		double capatSuperior=1000;
		try {
			film.setPret(capatSuperior);
			if(film.pretFinal()>1000)
				fail("Valoare prea mare pentru pret");
		} catch (ExceptiePret e) {

		}
	}

}
