package ichim.proiect.cts.junit;

import ichim.proiect.cts.Film;
import ichim.proiect.cts.Produs;
import junit.framework.TestCase;

public class TestFilmSetPret extends TestCase {

	Produs produs;
	
	public TestFilmSetPret(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		produs=new Film("",2);
	}
	
	public void testValoareNormala(){
		double valoareNormala=20;
		try {
			produs.setPret(valoareNormala);
		} catch (Exception e) {
			fail("Setarea unei valori normale");
		}
		assertEquals("Verificare pret valoare normala",valoareNormala,produs.getPret());
	}
	
	public void testCapatInferior(){
		double capatInferior=0;
		try{
			produs.setPret(capatInferior);
			fail("Lipsa exceptie capat inferior");
		}
		catch(Exception ex){
			
		}
	}
	
	public void testCapatSuperior(){
		double capatSuperior=1000;
		try {
			produs.setPret(capatSuperior);
		} catch (Exception e) {
			fail("Capatul superior al intervalului este valid");
		}
		assertEquals("Verificare pret capat superior",capatSuperior,produs.getPret());
	}
	
	public void testValoriMari(){
		double valoareMica=-1;
		try{
			produs.setPret(valoareMica);
			fail("Lipsa exceptie valori negative");
		}
		catch(Exception ex){
			
		}
	}

	public void testValoriMici(){
		double valoareMare=0;
		try{
			produs.setPret(valoareMare);
			fail("Lipsa exceptie valori prea mari");
		}
		catch(Exception ex){
			
		}
	}
}
