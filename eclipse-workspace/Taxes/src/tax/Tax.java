package tax;

public class Tax {
	
	public float method1(float salary) {
		
		float taxPerc;
		
		if (salary >= 0 && salary <= 14999) {
			taxPerc = 0;
		}
		else if (salary >= 15000 && salary <= 19999) {
			taxPerc = 10;
		}
		else if (salary >= 20000 && salary <= 29999) {
			taxPerc = 15;
		}
		else if (salary >= 30000 && salary <= 44999) {
			taxPerc = 20;
		}
		else if (salary >= 45000) {
			taxPerc = 25;
		}
		else {
			System.out.println("Invalid salary.");
			return 0;
		}
		
		return taxPerc;
	}

}
