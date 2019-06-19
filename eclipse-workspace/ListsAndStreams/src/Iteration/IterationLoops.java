package Iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterationLoops {
	
	public void IterationLoops() {
	
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Find max value:
		int max = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		System.out.println(max);
		
		// Find min value:
		int min = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) < min) {
				min = nums.get(i);
			}
		}
		System.out.println(min);
		
		// Remove odd numbers:
		List<Integer> numsNew = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 == 0) {
				numsNew.add(i); 
			}
		}
		System.out.println(numsNew);
		
		// Remove even numbers:
		numsNew = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 != 0) {
				numsNew.add(i);
			}
		}
		System.out.println(numsNew);
		
		// Sum of the list:
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		System.out.println(sum);
		
		// Square, then remove even numbers, then find min:
		for (int i = 0; i < nums.size(); i++) {			
			nums.set(i, nums.get(i)*nums.get(i));
		}
		System.out.println(nums + " (Sqaure)");
		IterationMethods itr = new IterationMethods();
		nums = itr.getOdd(nums);
		System.out.println(nums + " (Remove even)");
		min = itr.getMin(nums);
		System.out.println(min + " (Min)");
		System.out.println();
	
	}

}
