// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
                
        int i = 0, indexAt = 0;
        while(i < haystack.lengt()) {
            if (haystack.charAt(i) == needle.charAt(i)) {
                indexAt = i;
                i++;
            } else
                i++;
        }
        
        return -1;
    }
}
