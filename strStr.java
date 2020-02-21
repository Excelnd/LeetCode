// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
                
        int i = 0, indexAt = 0;
        HashMap<Character, Integer> map = new HashMap<String, Integer>();
        
        
        while(i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(i)) {
                map.put(haystack.charAt(i), i);
                i++;
            } else
                i++;
        }
        if(needle.length() == map.size()) return map.get(0);
        
        return -1;
    }
}
