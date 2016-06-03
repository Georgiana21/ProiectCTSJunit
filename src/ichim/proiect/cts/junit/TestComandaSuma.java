package ichim.proiect.cts.junit;

import static org.mockito.Mockito.*;
import javax.activation.MimeTypeParameterList;

import ichim.proiect.cts.Carte;
import ichim.proiect.cts.Comanda;
import ichim.proiect.cts.Film;
import ichim.proiect.cts.Muzica;
import ichim.proiect.cts.Produs;
import junit.framework.TestCase;

public class TestComandaSuma extends TestCase {

	Comanda comanda;
	
	public TestComandaSuma(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		comanda=new Comanda("");
	}
	
	public void testNiciunProdus(){
		double valoareAsteptata=0;
		assertEquals("Verificare suma fara niciun produs",
				valoareAsteptata, comanda.calculSumaDePlata());
	}
	
	public void testUnProdus(){
		double valoareAsteptata=5*(1+Produs.TVA);
		comanda.adaugaProdus(new Film("",5));
		assertEquals("Verificare suma cu un produs",
				valoareAsteptata, comanda.calculSumaDePlata());
	}
	
	public void testMaiMulteProduse(){
		double valoareAsteptata=(5+10+20+14)*(1+Produs.TVA);
		comanda.adaugaProdus(new Film("",5));
		comanda.adaugaProdus(new Film("",10));
		comanda.adaugaProdus(new Film("",20));
		comanda.adaugaProdus(new Film("",14));
		assertEquals("Verificare suma cu mai multe produse",
				valoareAsteptata, comanda.calculSumaDePlata());
	}
	
	public void testPerformanta(){
		comanda.adaugaProdus(new Film("",5));
		comanda.adaugaProdus(new Film("",10));
		comanda.adaugaProdus(new Film("",20));
		comanda.adaugaProdus(new Film("",14));
		comanda.adaugaProdus(new Film("",5));
		comanda.adaugaProdus(new Film("",10));
		comanda.adaugaProdus(new Film("",20));
		comanda.adaugaProdus(new Film("",14));
		comanda.adaugaProdus(new Film("",5));
		comanda.adaugaProdus(new Film("",10));
		comanda.adaugaProdus(new Film("",20));
		comanda.adaugaProdus(new Film("",14));
		long beforeCall = System.currentTimeMillis();
		comanda.calculSumaDePlata();
		long afterCall=System.currentTimeMillis();
		if(afterCall-beforeCall>0.05)
			fail("Timp prea mare de executie!");
	}
	
	public void testMock(){
		Produs film=mock(Film.class);
		when(film.pretFinal()).thenReturn(10.0);
		Produs carte=mock(Carte.class);
		when(carte.pretFinal()).thenReturn(20.0);
		Produs muzica=mock(Muzica.class);
		when(muzica.pretFinal()).thenReturn(30.0);
		comanda.adaugaProdus(film);
		comanda.adaugaProdus(carte);
		comanda.adaugaProdus(muzica);
		double valoareAsteptata=60.0;
		assertEquals("Verificare metoda cu mock", valoareAsteptata,comanda.calculSumaDePlata());
	}

}
