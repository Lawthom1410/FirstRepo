package cond;

public class Conditionals {
	
	public int method1(int num1, int num2, boolean myBool) {
		
		int myResult = 0;
		
		if (myBool) {
			myResult = num1 + num2;
		}
		else {
			myResult = num1 * num2;
		}
		
		if (num1 % 2 == 0 || num2 % 2 == 0) {
			myResult = 0;
		}
		return myResult;
	}

}
