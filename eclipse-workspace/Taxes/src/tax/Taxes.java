package tax;

public class Taxes {
	
	public static void main(String[] args) {
		Tax tx = new Tax();
		
		float salary = 15000;
		
		float taxPerc = tx.method1(salary);
		System.out.println(taxPerc + "%");
	}
}
