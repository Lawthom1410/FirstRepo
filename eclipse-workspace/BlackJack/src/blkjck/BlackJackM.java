package blkjck;

public class BlackJackM {
	
	public int play (int num1, int num2) {
		int diff1 = 21 - num1;
		int diff2 = 21 - num2;
		int result = 100;
		
		if (num1 <= 21 && num2 <= 21) {
			if (diff1 < diff2) {
				result = num1;
			}
			else {
				result = num2;
			}
		}
		else if (num1 <= 21 && num2 > 21) {
			result = num1;
		}
		else if (num1 > 21 && num2 <= 21) {
			result = num2;
		}
		else if (num1 > 21 && num2 > 21) {
			result = 0;
		}
		
		return result;		
	}

}
