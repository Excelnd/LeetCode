// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
    
        for (int i = 0 ;    ; i++) {
            for (int j = 0 ;    ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                
                if (needle.charAt(j) != haystack.charAt(i + j))
                    break;
            }
        }
    }
}
