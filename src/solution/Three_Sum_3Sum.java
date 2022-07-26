package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);

		List<List<Integer>> triplet = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {

			if (nums[i] > 0)
				break;

			if (i == 0 || (i > 0) && (nums[i] != nums[i - 1])) {
				int lp = i + 1;
				int rp = nums.length - 1;

				while (lp < rp) {

					if (nums[i] + nums[lp] + nums[rp] == 0) {
						triplet.add(Arrays.asList(nums[i], nums[lp], nums[rp]));

						while (lp < rp && nums[lp] == nums[lp + 1])
							lp++;
						while (lp < rp && nums[rp] == nums[rp - 1])
							rp--;
						lp++;
						rp--;
					} else if (nums[i] + nums[lp] + nums[rp] < 0) {
						lp++;
					} else
						rp--;
				} 

			}
		}
		return triplet;
	}
}
