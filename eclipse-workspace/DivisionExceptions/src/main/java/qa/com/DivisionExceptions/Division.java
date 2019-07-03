package qa.com.DivisionExceptions;

public class Division {
	
	public int divide(int num1, int num2) {
		try {
			if (num2 > num1) {
				throw new DivisionException();
			}
			return num1/num2;	
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			return Integer.MAX_VALUE;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

}
