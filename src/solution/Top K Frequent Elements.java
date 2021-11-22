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
        }
        
        // init heap with leastFrequent elements first
        Queue<Integer> minHeap = new PriorityQueue<>(
            (v1, v2) 
            -> hmCount.get(v1) - hmCount.get(v2));
        
        // add elements to Min-Heap, and keep Top frequent elements only
        for(int n: hmCount.keySet()) {
        	minHeap.add(n);
        	if(minHeap.size() > k) minHeap.poll();
        }
        
        // Build Output Array
        int[] topFrequentElements = new int[k];
        for (int i = k-1; i >= 0 ; --i) {
        	topFrequentElements[i] = minHeap.poll();
        }

		return topFrequentElements;
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,1,1,2,2,3};
    	int k = 2;
    	Solution3 sol = new Solution3();
    	sol.topKFrequent(nums, k);
    }
}