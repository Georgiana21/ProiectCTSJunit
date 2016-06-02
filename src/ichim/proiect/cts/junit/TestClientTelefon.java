package ichim.proiect.cts.junit;

import ichim.proiect.cts.Client;
import junit.framework.TestCase;

public class TestClientTelefon extends TestCase {

	Client client;
	
	public TestClientTelefon(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		client=new Client();
	}
	
	public void testPutineCaractereNumerice(){
		try{
			client.setTelefon("0942");
			fail("Prea putine caractere");
		}catch(Exception e){
			
		}
	}
	
	public void testMulteCaractereNumerice(){
		try{
			client.setTelefon("0945434353452");
			fail("Prea multe caractere");
		}catch(Exception e){
			
		}
	}
	
	public void testNumarBunCaractereNumerice(){
		try{
			String numarTelefon="1548632578";
			client.setTelefon(numarTelefon);
			assertEquals("Verificare telefon",numarTelefon,client.getTelefon());
			
		}catch(Exception e){
			
		}
	}
	
	public void testPutineCaractereNenumerice(){
		try{
			client.setTelefon("dsad");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testMulteCaractereNenumerice(){
		try{
			client.setTelefon("dsadasdasdgfdgtrd");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testNumarBunCaractereNenumerice(){
		try{
			client.setTelefon("grwddbjutd");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testPutineCaractereNumericeSiNenumerice(){
		try{
			client.setTelefon("0942d");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testMulteCaractereNumericeSiNenumerice(){
		try{
			client.setTelefon("0942ddsage54345");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testNumarBunCaractereNumericeSiNenumerice(){
		try{
			client.setTelefon("0942ddsage");
			fail("Caracterele trebuie sa fie numerice");
		}catch(Exception e){
			
		}
	}
	
	public void testNull(){
		try{
			client.setTelefon(null);
			fail("Valoarea null nu este acceptata");
		}catch(Exception e){
			
		}
	}

}
