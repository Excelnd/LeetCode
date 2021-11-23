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
    	
    	for(String str : strs) {
    		char[] markChar = new char[26];
    		for(char c: str.toCharArray()) {
    			markChar[c - 'a']++;
    		}
    		
    		String keyMarkedString = String.valueOf(markChar);
    		
    		if (!hashMap.containsKey(keyMarkedString)) {
    			hashMap.put(keyMarkedString, new ArrayList<>());
    		}
    		
    		hashMap.get(keyMarkedString).add(str);
    		
        	// Input: strs = ["eat","tea","tan","ate","nat","bat"]
        	// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    	}

		return new ArrayList<>(hashMap.values());  
    }
    
//	public static void main(String[] args) {
//
//	}
    
}

