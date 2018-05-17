package ejercicio3Test;

import ejercicio3.Cal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BCCMejorado {
	
	@Test
	public void test1() {
		assertThat(Cal.cal(1,3,12,20,2016), equalTo(352));
	}
	@Test
	public void test2() {
		assertThat(Cal.cal(1,3,12,20,2017), equalTo(351));
	}
	@Test
	public void test3() {
		assertThat(Cal.cal(2,3,12,20,2016), equalTo(321));
	}
	@Test
	public void test4() {
		assertThat(Cal.cal(1,29,12,20,2016), equalTo(326));
	}
	@Test
	public void test5() {
		assertThat(Cal.cal(1,3,2,20,2016), equalTo(48));
	}
	@Test
	public void test6() {
		assertThat(Cal.cal(1,3,12,29,2016), equalTo(361));
	}
	@Test
	public void test7() {
		assertThat(Cal.cal(4,3,12,20,2016), equalTo(261));
	}
	
	@Test
	public void test8() {
		assertThat(Cal.cal(1,30,12,20,2016), equalTo(325));
	}
	
	@Test
	public void test9() {
		assertThat(Cal.cal(1,3,11,20,2016), equalTo(322));
	}
	
	@Test
	public void test10() {
		assertThat(Cal.cal(1,3,12,30,2016), equalTo(362));
	}
	
	@Test
	public void test11() {
		assertThat(Cal.cal(1,31,12,20,2016), equalTo(324));
	}
	
	@Test
	public void test12() {
		assertThat(Cal.cal(1,3,12,31,2016), equalTo(363));
	}

	@Test
	public void test13() {
		assertThat(Cal.cal(1,3,1,31,2016), equalTo(28));
	}
	
	@Test
	public void test14() {
		assertTrue(Cal.cal(2,10,4,20,2100) == 69);
	}
	
	@Test
	public void test15() {
		assertTrue(Cal.cal(2,10,2,20,2015) == 10);
	}
	
	@Test
	public void test16() {
		assertTrue(Cal.cal(2,10,3,20,400) == 39 );
	}
	
	
}
