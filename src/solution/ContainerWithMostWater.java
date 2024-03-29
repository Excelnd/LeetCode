package solution;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {

		int leftPointer = 0, rightPointer = height.length - 1;
		int maxArea = 0;

		while (leftPointer < rightPointer) {

			maxArea = Math.max(maxArea,
					Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer));

			if (height[leftPointer] <= height[rightPointer]) {
				leftPointer++;
			} else {
				rightPointer--;
			}
		}
		return maxArea;
	}
	
}
