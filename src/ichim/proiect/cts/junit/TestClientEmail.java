package ichim.proiect.cts.junit;

import ichim.proiect.cts.Client;
import junit.framework.TestCase;

public class TestClientEmail extends TestCase {
	
	Client client;

	public TestClientEmail(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		client=new Client();
	}
	
	public void testDoarDenumire(){
		try{
			String email="email";
			client.setEmail(email);
			fail("Formatul este incorect");
		}catch(Exception e){
			
		}
	}
	
	public void testDenumireAt(){
		try{
			String email="email@";
			client.setEmail(email);
			fail("Formatul este incorect");
		}catch(Exception e){
			
		}
	}
	
	public void testDenumireAtDomeniu(){
		try{
			String email="email@domeniu";
			client.setEmail(email);
			fail("Formatul este incorect");
		}catch(Exception e){
			
		}
	}
	
	public void testDenumireAtDomeniuPunct(){
		try{
			String email="email@domeniu.";
			client.setEmail(email);
			fail("Formatul este incorect");
		}catch(Exception e){
			
		}
	}
	
	public void testValoareNormala(){
		try{
			String email="email@domeniu.com";
			client.setEmail(email);
			assertEquals("Verificare email", email,client.getEmail());
		}catch(Exception e){
			
		}
	}

}
