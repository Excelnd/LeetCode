package solution;

public class ProductOfArrayExceptSelf {

	
	public int[] productExceptSelf(int[] nums) {

		/*
		 * Input: nums = [1,2,3,4]
		 * 
		 * Output: [24,12,8,6]
		 */

		int[] res = new int[nums.length];

		int prefix = 1;
		int postfix = 1;

		// res[0] = prefix;
		for (int i = 0; i < nums.length; i++) {
			res[i] = prefix * res[i];
			prefix = prefix * nums[i];

		}

		for (int i = nums.length - 1; i >= 0; i--) {
			res[i] = postfix * res[i];
			postfix = postfix * nums[i];

		}

		return res;
	}
}
    
    
