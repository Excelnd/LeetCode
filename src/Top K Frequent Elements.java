import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution3 {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        
        // map
        Map<Integer, Integer> hmCount = new HashMap();
        
        for (int element: nums) {
            hmCount.put(element, hmCount.getOrDefault(element, 0) + 1);
            
        // init heap
        Queue<Integer> minHeap = new PriorityQueue<>(
            (v1, v2) 
            -> hmCount.get(v1) - hmCount.get(v2));
        }
    	
    	
    	
		return nums;
        
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,1,1,2,2,3};
    	int k = 2;
    	Solution3 sol = new Solution3();
    	sol.topKFrequent(nums, k);
    }
}