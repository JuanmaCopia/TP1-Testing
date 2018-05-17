package ejercicio3Test;

import ejercicio3.Cal;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ClauseCoverage {
	
	@Test
	public void test1() {
		assertTrue(Cal.cal(2,10,3,20,2016) == 39);
	}
	
}
