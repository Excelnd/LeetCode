package solution;

import java.util.HashMap;

public class SubarraySumEqualsK {

	public int subarraySum(int[] nums, int k) {

		int count = 0;
		int prefixSums = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		// Input: nums = [1,2,3], k = 3

		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {

			prefixSums = prefixSums + nums[i];

			if (map.containsKey(prefixSums - k)) {
				count = count + map.get(prefixSums - k);
			}

			map.put(prefixSums, map.getOrDefault(prefixSums, 0) + 1);

		}

		return count;
	}

}
