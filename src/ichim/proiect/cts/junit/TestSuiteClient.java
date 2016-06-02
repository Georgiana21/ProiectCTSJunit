package ichim.proiect.cts.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteClient extends TestCase {

	public static Test suite(){
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestClientEmail.class);
		colectie.addTestSuite(TestClientTelefon.class);
		colectie.addTestSuite(TestClientVarsta.class);
		colectie.addTestSuite(TestBuilderEsteFidel.class);
		return colectie;
	}
}
