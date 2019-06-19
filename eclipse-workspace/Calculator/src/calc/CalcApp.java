package calc;
import java.util.Scanner;

public class CalcApp {
	
	public static void main(String[] args) {
		
	    Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter first number:");
	    int num1 = Integer.parseInt(myObj.nextLine());
	    
	    System.out.println("Enter second number:");	    
	    int num2 = Integer.parseInt(myObj.nextLine());
	    
	    int myResult = 0;	    
	    int opCheck = 0;
	    while (opCheck == 0) {
	    	System.out.println("Enter operator:");
		    String op = myObj.nextLine();
		    
		    if (op.equals("+")) {
		    	myResult = num1 + num2;
		    	opCheck = 1;
		    }
		    else if (op.equals("-")) {
		    	myResult = num1 - num2;
		    	opCheck = 1;
		    }
		    else if (op.equals("*")) {
		    	myResult = num1 * num2;
		    	opCheck = 1;
		    }
		    else if (op.equals("/")) {
		    	myResult = num1 / num2;
		    	opCheck = 1;
		    }
		    else {
		    	System.out.println("Invalid operator. Try again.");
		    }
	    }
	    	    System.out.println("\n" + myResult);
	}
}
