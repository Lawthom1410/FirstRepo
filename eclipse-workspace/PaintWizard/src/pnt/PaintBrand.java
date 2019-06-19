package pnt;

public class PaintBrand {
	
	private String name;
	private int size;
	private double price;
	private int coverage;
	private double waste;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCoverage() {
		return coverage;
	}
	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	public double getWaste(double roomSize) {
		double usage = roomSize/coverage;
//		System.out.println("Usage: " + usage);
		double doubleOfTins = usage/size;
//		System.out.println("Tins: " + doubleOfTins);
		double noOfTins = Math.ceil(doubleOfTins);
//		System.out.println("Tins: " + noOfTins);
		double wasteTin = noOfTins - doubleOfTins;
//		System.out.println("WasteTin: " + wasteTin);
		waste = wasteTin * size;
		return waste;
	}
	
	public double getCost(double roomSize) {
		double noOfTins = Math.ceil(roomSize/(coverage*size));
//		System.out.println("Tins: " + noOfTins);
		cost = noOfTins * price;		
		return cost;
	}
	
	public PaintBrand(String name, int size, double price, int coverage) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.coverage = coverage;
	}
}
