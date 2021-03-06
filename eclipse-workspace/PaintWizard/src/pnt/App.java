package pnt;

public class App {

	public static void main(String[] args) {
		
		PaintBrands brandList = new PaintBrands();
		PaintBrand cheapoMax = new PaintBrand("Cheapo Max", 21, 19.99, 10);
		PaintBrand thatOneWithTheDog = new PaintBrand("That One with the Dog", 40, 34.38, 12);
		PaintBrand averageJoes = new PaintBrand("Average Joes", 16, 17.99, 11);
		PaintBrand duluxourousPaints = new PaintBrand("Duluxourours Paints", 10, 25, 22);
		
		brandList.addBrand(cheapoMax);
		brandList.addBrand(thatOneWithTheDog);
		brandList.addBrand(averageJoes);
		brandList.addBrand(duluxourousPaints);
		
		double roomSize = 200;
		
		double myWaste = cheapoMax.getWaste(roomSize);
		double myCost = cheapoMax.getCost(roomSize);
//		System.out.println(myWaste);
		System.out.println(cheapoMax.getCost(roomSize));
		System.out.println(thatOneWithTheDog.getCost(roomSize));
		System.out.println(averageJoes.getCost(roomSize));
		System.out.println(duluxourousPaints.getCost(roomSize));
		
		PaintBrand cheapestBrand = brandList.cheapestBrand(roomSize);
		System.out.println(cheapestBrand.getName());
		

	}

}
