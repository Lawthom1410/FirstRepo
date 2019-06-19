package cond;

public class ConditionalsApp {

	public static void main(String[] args) {
		
		Conditionals cond = new Conditionals();
		
		int num1 = 1;
		int num2 = 29348;
		boolean myBool = false;
		
		int myResult = cond.method1(num1, num2, myBool);
		System.out.println(myResult);

	}

}
