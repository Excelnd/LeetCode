package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {

	
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	if (strs == null || strs.length == 0) return new ArrayList<>();
    	
    	Map<String, List<String>> hashMap = new HashMap<>();
    	
//    	for(String str : strs) {
//    		char[] charEachString = str.toCharArray();
//    		Arrays.sort(charEachString); // eat = aet, tea = aet, tan = ant, ate = aet, etc...,
//    		String keySortedString = String.valueOf(charEachString);
//    		
//    		if (!hashMap.containsKey(keySortedString)) {
//    			hashMap.put(keySortedString, new ArrayList<>());
//    		}
//    		hashMap.get(keySortedString).add(str);
//
//    	}

		return new ArrayList<>(hashMap.values());        
    }
        
	public static void main(String[] args) {
    	// Input: strs = ["eat","tea","tan","ate","nat","bat"]
    	// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	}
}
