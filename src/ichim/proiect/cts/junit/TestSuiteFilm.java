package ichim.proiect.cts.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteFilm extends TestCase {
	
	public static Test suite(){
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestFilmPretFinal.class);
		colectie.addTestSuite(TestFilmSetPret.class);
		colectie.addTest(new TestMagazinGetProdus("testFilm"));
		return colectie;
	}
}
