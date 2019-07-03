package qa.com.MorseCode;

import static org.junit.Assert.assertTrue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
		
	@Test
	public void testAddToLib() {
		assertTrue(newLib.addItem(newBook));
	}
}
