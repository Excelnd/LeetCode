public class Solution {
    
    public int reverseBits(int n) {
        int rBits = 0;
        for (int i = 0; i < 32; i++) {
            rBits = rBits + (n & 1);
            n = n >>> 1;
            if (i < 31) {
                rBits <<= 1;
            }
        }
        return rBits;
    //  00000010100101000001111010011100   
    }
}
