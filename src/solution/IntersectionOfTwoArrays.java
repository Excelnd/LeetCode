package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
    public int[] intersection(int[] nums1, int[] nums2) {
    	// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    	
    	Set<Integer> hashSet = new HashSet<>();    	
    	
    	List<Integer> intersection = new ArrayList<>();
    	
    	for(int n: nums1) hashSet.add(n);    			
		
    	for(int n: nums2) {
    		if(hashSet.contains(n)) {
	    		intersection.add(n);
                hashSet.remove(n);
	    	}
    	}
    	
    	int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i]=intersection.get(i);
        }
    	
    return result;        
    }
}
