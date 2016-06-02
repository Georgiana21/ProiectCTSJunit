package ichim.proiect.cts.junit;

import ichim.proiect.cts.Client;
import ichim.proiect.cts.ExceptieDenumireIncorecta;
import junit.framework.TestCase;

public class TestClientAdresa extends TestCase {

	Client client;
	
	public TestClientAdresa(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		client=new Client();
	}
	
	public void testNull(){
		try{
			client.setAdresa(null);
			fail("Valoarea null nu trebuie acceptata!");
		}
		catch(Exception e){
			
		}
	}

	public void testStringGol(){
		try{
			client.setAdresa("");
			fail("Stringul gol nu trebuie acceptat!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testPutineCaractere(){
		try{
			client.setAdresa(null);
			fail("Trebuie sa aiba macar 10 caractere!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testValoareNormala(){
		String adresa="Bucuresti, str Brailita nr 7";
		try {
			client.setAdresa(adresa);
			assertEquals("Verificare valoare normala",adresa,client.getAdresa());
		} catch (ExceptieDenumireIncorecta e) {

		}
		
	}
}
