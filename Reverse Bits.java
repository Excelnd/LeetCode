public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        char[] ch = str.toCharArray();
        for (int i = str.length()-1; i <= 0; i--) {
            ch[i] = str.charAt(i);
        }
        
        String fin = new String(ch);
        int rev = Integer.parseInt("fin", 2);
        return rev;
    }
    

}
