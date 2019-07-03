package qa.com.DivisionExceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	private Division div = new Division();

	@Test
	public void testDiv() {
		assertEquals(6, div.divide(12, 2));
	}
	
	@Test
	public void testDiv0() {
		assertEquals(Integer.MAX_VALUE, div.divide(12, 0));
	}
	
	@Test
	public void testTooBig() {
		assertEquals(0, div.divide(1, 6));
	}
}
