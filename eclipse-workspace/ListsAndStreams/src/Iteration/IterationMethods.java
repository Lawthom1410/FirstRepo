package Iteration;

import java.util.ArrayList;
import java.util.List;

public class IterationMethods {
	
	public List<Integer> getOdd(List<Integer> nums) {
		List<Integer> numsNew = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 != 0) {
				numsNew.add(i);
			}
		}
		return numsNew;
	}
	
	public int getMin(List<Integer> nums) {
		int min = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) < min) {
				min = nums.get(i);
			}
		}
		return min;
	}

}
