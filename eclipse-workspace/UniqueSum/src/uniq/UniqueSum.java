package uniq;

import java.util.Arrays;
import java.util.List;

public class UniqueSum {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 2;
		
		List<Integer> numList = Arrays.asList(num1, num2, num3);
		
		int sum = 0;
		for (int i : numList) {
			int iCount = 0;
			for (int j : numList) {	
				
				if (i == j) {
					iCount ++;
				}				
			}			
			if (iCount == 1) {
				sum += i;
			}
		}		
		System.out.println(sum);		
	}

}
