// Return the index of the first occurrence of needle in String1, or -1 if needle is not part of String2.
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.isEmpty()) return 0;
        int len = haystack.length();
        int ndlen = needle.length();
        
        
        int count = 0;
        if (ndlen > len) {
            return -1;
        }
        
        for ( int i = 0; i < len - ndlen +1; i++) {
            for ( int j = 0; j < ndlen; j++) {
                if (hay[j + i] == need[j]) {
                    count++;
                    if (count == ndlen) {
                        return i;
                    }
                }
                else {
                    count = 0;
                    break;
                }
            }

        }
    return -1;      
    }
}
