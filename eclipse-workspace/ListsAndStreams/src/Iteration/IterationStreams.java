package Iteration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IterationStreams {
	
	public void IterationStreams() {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Find max value:
		int max = nums.stream().reduce((a, b) -> Math.max(a, b)).get();
		System.out.println(max);
		
		// Find min value:
		int min = nums.stream().reduce((a, b) -> Math.min(a, b)).get();
		System.out.println(min);
		
		// Remove odd numbers:
		List<Integer> numsNew = nums.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(numsNew);
		
		// Remove even numbers:
		numsNew = nums.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println(numsNew);
		
		// Sum of list:		
		int sum = nums.stream().reduce(0, (a,b) -> a + b);
		System.out.println(sum);	
		
		// Square, then remove even numbers, then find min:
		min = nums.stream().map(i -> i*i).filter(i -> i%2 != 0)
				.reduce((a, b) -> Math.min(a,b)).get();
		System.out.println(min);
		
		
	}

}
