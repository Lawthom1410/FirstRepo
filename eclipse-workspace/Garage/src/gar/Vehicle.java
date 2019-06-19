package gar;

public abstract class Vehicle {
	
	private int noOfWheels;
	private int defaultNoOfWheels;
	private float damage;
	private String regNumber;
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getDefaultNoOfWheels() {
		return defaultNoOfWheels;
	}
	public void setDefaultNoOfWheels(int defaultNoOfWheels) {
		this.defaultNoOfWheels = defaultNoOfWheels;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	

}
