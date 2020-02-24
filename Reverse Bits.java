public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        int r = 0;
        char[] ch = str.toCharArray();
        for (int i = str.length()-1; i <= 0; i--) {
            // 00000010100101000001111010011100
            ch[r] = str.charAt(i);
            r++;
        }
        
        String fin = new String(ch);
        int rev = Integer.parseInt(fin, 2);
        return rev;
    }
    

}
