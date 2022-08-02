package solution;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        
        int lp = 0, rp = height.length-1;
        int maxArea = 0;
        
        while (lp < rp) {

            int lowLength = Math.min(height[lp], height[rp]);
            int tempArea = lowLength * (rp - lp);
            
            if (height[lp] <= height[rp]) {
                lp++;
            } else {
                rp--;
            }
            maxArea = Math.max(maxArea, tempArea);
        }
        return maxArea;
    }
	
}
