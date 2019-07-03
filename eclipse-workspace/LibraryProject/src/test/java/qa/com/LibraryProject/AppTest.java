package qa.com.LibraryProject;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class AppTest {
	
	private Book newBook = new Book();
	private Map newMap = new Map();
	private Newspaper newNewspaper = new Newspaper();
	private Library newLib = new Library();
	private Person newPerson = new Person("New", "Person");
	
	@Test
	public void testAddToLib() {
		assertTrue(newLib.addItem(newBook));
	}
	
	@Test
	public void testRemoveFromLib() {
		newLib.addItem(newBook);
		assertTrue(newLib.removeItem(newBook));
	}
	
	@Test
	public void testCheckOut() {
		this.newLib.addItem(newBook);
		this.newBook.setCheckedOut(true);
		List<Item> checkedOut = newLib.getCheckedOut();
		assertEquals(newBook, checkedOut.get(0));
	}	
	
	@Test
	public void testCheckIn() {
		this.newLib.addItem(newBook);
		List<Item> checkedIn = newLib.getCheckedIn();
		assertEquals(newBook, checkedIn.get(0));		
	}
	
	@Test
	public void testUpdate() {
		this.newLib.addItem(newBook);
		newBook.setAuthor("Me");		
		this.newBook.setAuthor("Myself");		
		assertEquals("Myself", newBook.getAuthor());
	}
	
	@Test
	public void testRegisterPerson() {
		this.newLib.registerPerson(newPerson);
		List<Person> customers = newLib.getCustomers();
		System.out.println(customers.get(0).getLastName());		
		assertEquals("Person", customers.get(0).getLastName());
	}
	
	
	
}