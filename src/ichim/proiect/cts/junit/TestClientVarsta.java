package ichim.proiect.cts.junit;

import ichim.proiect.cts.Client;
import junit.framework.TestCase;

public class TestClientVarsta extends TestCase {
	
	Client client;

	public TestClientVarsta(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		client=new Client();
	}
	
	public void testValoareMaxim(){
		try{
			client.setVarsta(Integer.MAX_VALUE);
			fail("Nu trebuie acceptata valoarea maxima!");
		}catch(Exception e){
			
		}
	}
	
	public void testValoareMinima(){
		try{
			client.setVarsta(Integer.MIN_VALUE);
			fail("Nu trebuie acceptata valoarea minima!");
		}catch(Exception e){
			
		}
	}
	
	public void testZero(){
		try{
			client.setVarsta(Integer.MAX_VALUE);
			fail("Nu trebuie acceptata valoarea zero!");
		}catch(Exception e){
			
		}
	}
	
	public void testValoareNormala(){
		try{
			int varsta=20;
			client.setVarsta(varsta);
			assertEquals("Verificare varsta", varsta,client.getVarsta());
		}catch(Exception e){
			
		}
	}

}
