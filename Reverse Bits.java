public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.tobinaryString(n);
        char[] ch = new char[str.length()];
        for (int i = str.length()-1; i <= 0; i--) {
            ch[i] = str.charAt(i);
        }
        
        int rev = ch.toInteger();
    }
    

}
