package twoSum;

import java.util.HashMap;
import java.util.Map;

public class twoSumSecondBestCase {

	public static int[] twoSum(int[] nums, int target) {

		// Runs in O(n), as we are comparing our target as we iterate after inserting values into map

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			// Since we are returning the indices we will make our value the index
			map.put(nums[i], i);
		}


		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			// Checking if our solution is a previous value in the array

			if (map.containsKey(complement) && map.get(complement) != i) { 

				// && map.get(complement) != i ensures we aren't comparing value to itself 

				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}


