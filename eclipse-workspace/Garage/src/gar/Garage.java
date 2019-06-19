package gar;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}
	
	public void printVehicles() {
		System.out.println(vehicles);
	}
	
	public void fixVehicle(Vehicle vehicle) {
		double bill = vehicle.getDamage() * 5.99;
		if (vehicle instanceof Car) {
			int missingDoors = ((Car) vehicle).getDefaultNoOfDoors() - ((Car)vehicle).getNoOfDoors();
			bill += missingDoors * 39.99;
		}
		else if (vehicle instanceof Motorcycle) {
			int missingHandlebars = 2 - ((Motorcycle)vehicle).getNoOfHandlebars();
			bill += missingHandlebars * 10.99;
		}
		else if (vehicle instanceof Unicycle) {
			int missingPedals = 2 - ((Unicycle)vehicle).getNoOfPedals();
			bill += missingPedals * 5.99;
		}
		System.out.println(bill);		
	}
}
