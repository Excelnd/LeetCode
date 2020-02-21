// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        
        int i=0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 i < hayStack.length(); i++) {
            map.put(hayStack.charAt(i), i);
        }
        
        for(int i = 0; i < needle.length(); i++) {
            if(map.containsKey(hayStack.charAt(i) == needle.charAt(i)));
            int indexOf = map.get(hayStack.charAt(i));
            return indexOf;
        }
        retrun -1;
    }
}
