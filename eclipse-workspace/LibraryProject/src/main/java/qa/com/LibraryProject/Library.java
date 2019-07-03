package qa.com.LibraryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

	private List<Item> items = new ArrayList<>();
	private List<Person> customers = new ArrayList<>();

	private int idCount = 0;

	public List<Person> getCustomers() {
		return customers;
	}

	public boolean registerPerson(Person person) {
		return this.customers.add(person);
	}
	
	

	public List<Item> getItems() {
		return items;
	}

	public boolean addItem(Item item) {
		idCount++;
		item.setItemId(idCount);
		return this.items.add(item);
	}

	public boolean removeItem(Item item) {
		return this.items.remove(item);
	}

	public boolean checkOut(Item item) {
		for (Item _item : this.items) {
			if (_item.getItemId() == item.getItemId()) {
				item.setCheckedOut(true);
			}
		}
		return false;
	}

	public boolean checkIn(Item item) {
		for (Item _item : this.items) {
			if (_item.getItemId() == item.getItemId()) {
				item.setCheckedOut(false);
			}
		}
		return false;
	}

	public List<Item> getCheckedOut() {
		return this.items.stream().filter(item -> item.isCheckedOut() == true).collect(Collectors.toList());
	}
	
	public List<Item> getCheckedIn() {
		return this.items.stream().filter(item -> item.isCheckedOut() == false).collect(Collectors.toList());
	}

}
