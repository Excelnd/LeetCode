// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < haystack.length(); i++) {
            map.put(haystack.charAt(i), i + 1);
        }
        
        for(int i = 0; i < needle.length(); i++) {
            if(map.containsKey(haystack.charAt(i) == needle.charAt(i)));
            int indexOf = map.get(haystack.charAt(i));
            return indexOf + 1;
        }
        return -1;
    }
}
