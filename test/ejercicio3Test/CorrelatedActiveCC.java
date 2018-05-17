package ejercicio3Test;

import ejercicio3.Cal;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CorrelatedActiveCC {

	@Test
	public void test1() {
		assertTrue(Cal.cal(2,10,3,20,400) == 39 );
	}
	
	@Test
	public void test2() {
		assertTrue(Cal.cal(2,10,3,20,2003) == 38);
	}
	
	@Test
	public void test3() {
		assertTrue(Cal.cal(7,10,7,20,2004) == 10);
	}
	
	@Test
	public void test4() {
		assertTrue(Cal.cal(2,10,4,20,2100) == 69);
	}
	
	
	
}
