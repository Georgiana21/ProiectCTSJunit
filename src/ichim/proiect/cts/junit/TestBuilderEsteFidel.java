package ichim.proiect.cts.junit;

import ichim.proiect.cts.Client;
import ichim.proiect.cts.ClientBuilder;
import junit.framework.TestCase;

public class TestBuilderEsteFidel extends TestCase {

	public TestBuilderEsteFidel(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testBuilderEsteFidel(){
		Client client=new ClientBuilder("client")
				.esteFidel()
				.build();
		boolean esteFidel=true;
		assertEquals("Verificare este fidel",esteFidel,client.isEsteFidel());
	}
}
