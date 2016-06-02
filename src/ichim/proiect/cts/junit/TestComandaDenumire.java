package ichim.proiect.cts.junit;

import ichim.proiect.cts.Comanda;
import junit.framework.TestCase;

public class TestComandaDenumire extends TestCase {

	Comanda comanda;
	
	public TestComandaDenumire(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		comanda=new Comanda("");
	}
	
	public void testStringNull(){
		try{
			comanda.setDenumire(null);
			fail("Valoarea null nu trebuie acceptata!");
		}
		catch(Exception ex){
			
		}
	}
	
	public void testStringGol(){
		try{
			comanda.setDenumire(null);
			fail("Stringul gol nu trebuie acceptata!");
		}
		catch(Exception ex){
			
		}
	}
	
	public void testValoareNormala(){
		String denumire="comanda noua";
		try {
			comanda.setDenumire(denumire);
			assertEquals("Verificare setter valoare normala",denumire,comanda.getDenumire());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
