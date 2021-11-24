package solution;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public int[] setIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {

		int[] result = new int[set1.size()];
		int idx = 0;

		for (Integer s : set1) {
			if (set2.contains(s))
				result[idx++] = s;			
		}
		return Arrays.copyOf(result, idx);
	}

	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> setOne = new HashSet<Integer>();
		for (Integer n : nums1)
			setOne.add(n);

		HashSet<Integer> setTwo = new HashSet<Integer>();
		for (Integer n : nums2)
			setTwo.add(n);
		
		if (setOne.size() > setTwo.size()) return setIntersection(setOne, setTwo);
		else return setIntersection(setTwo, setOne);
	}
}
