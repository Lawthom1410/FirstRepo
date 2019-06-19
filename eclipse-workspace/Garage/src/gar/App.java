package gar;

public class App {

	public static void main(String[] args) {
		
		Car bertie = new Car();
		Motorcycle rita = new Motorcycle();		
		Unicycle simon = new Unicycle();
		Garage LSCustoms = new Garage();
		
		bertie.setNoOfDoors(2);
		bertie.setDefaultNoOfDoors(4);
		bertie.setDamage(23);
		
		LSCustoms.addVehicle(bertie);
		LSCustoms.addVehicle(rita);
		LSCustoms.addVehicle(simon);
		
		LSCustoms.removeVehicle(simon);
		
		LSCustoms.fixVehicle(bertie);
		
		

	}

}
