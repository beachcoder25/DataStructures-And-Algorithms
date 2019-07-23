package twoSum;

public class twoSumWorstCase {

	// Runs O(n^2) due to having to iterate through the entire array in
	// in the worst case (Last two values == complement || no solution is found)
	
	public static int[] twoSum(int[] nums, int target) 
	{

		for(int i=0; i < nums.length; i++)
		{ 
			// j = i + 1 or else we would be comparing the same value to itself
			for(int j= 1 + i; j < nums.length; j++) 
			{
				// Originally calculated: complement = target - nums[i]
				// But this can be done in the if statement as shown below
				if(nums[j] == target - nums[i])
				{

					return new int[] {i,j};
				}       
			}

		}
		throw new IllegalArgumentException("No two sum solution");
	}
}







