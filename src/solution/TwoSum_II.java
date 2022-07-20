package solution;

public class TwoSum_II {
	public int[] twoSum(int[] numbers, int target) {

		int leftPointer = 0;
		int rightPointer = numbers.length - 1;
		int sum = 0;

		while (leftPointer < rightPointer) {

			sum = numbers[leftPointer] + numbers[rightPointer];

			if (target == sum) {
				return new int[] { leftPointer + 1, rightPointer + 1 };
			}
			if (sum >= target) {
				rightPointer--;
			}
			if (sum < target) {
				leftPointer++;
			} 

		}
		return new int[] { 0, 0 };
	}
}
