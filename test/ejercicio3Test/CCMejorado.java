package ejercicio3Test;

import ejercicio3.Cal;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CCMejorado {
	
	@Test
	public void test1() {
		assertTrue(Cal.cal(2,10,3,20,2016) == 39);
	}
	
	@Test
	public void test2() {
		assertTrue(Cal.cal(2,10,2,20,2015) == 10);
	}
	
	@Test
	public void test3() {
		assertTrue(Cal.cal(2,10,4,20,2100) == 69);
	}
	
	@Test
	public void test5() {
		assertTrue(Cal.cal(1,3,12,20,2015) == 351);
	}
	
	@Test
	public void test16() {
		assertTrue(Cal.cal(2,10,3,20,400) == 39 );
	}
	
}
