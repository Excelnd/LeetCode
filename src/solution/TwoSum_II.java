package solution;

public class TwoSum_II {
	public int[] twoSum(int[] numbers, int target) {
        
        int[] index = new int[2];
        if (numbers.length < 2) return index;

		int leftPointer = 0;
		int rightPointer = numbers.length - 1;

		while (leftPointer < rightPointer) {

			int sum = numbers[leftPointer] + numbers[rightPointer];

			if (target == sum) {
				index[0] = leftPointer + 1;
                index[1] = rightPointer + 1;
                break;
			}
			if (sum >= target) {
				rightPointer--;
			}
			if (sum < target) {
				leftPointer++;
			} 

		}
		return index;
	}
}
