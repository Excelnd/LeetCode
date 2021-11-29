package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> hashSet = new HashSet<>();

		Arrays.sort(nums2);

		for (Integer num : nums1) {
			if (binarySearch(nums2, num)) {
				hashSet.add(num);
			}
		}

		int i = 0;
		int[] result = new int[hashSet.size()];

		for (Integer num : hashSet) {
			result[i++] = num;
		}

		return result;
	}

	public boolean binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		
		// nums1 = [4,9,5]
		// nums2 = [9,4,9,8,4], Arrays.Sort(num2); -- [4,4,8,9,9]
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return true;
			}
			if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return false;
	}
}
