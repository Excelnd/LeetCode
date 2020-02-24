public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int r = 0;
        char[] ch = str.toCharArray();
        char[] real = new real[31];
        
        for (int i = 0; i < ch.length; i++) {
            real[i] = ch[i];
        }
        
        for (int i = 31; i >= 0; i--) {
            // 00000010100101000001111010011100
            ch[r] = ch.charAt(i);
            r++;
        }
        
        String fin = new String(ch);
        int rev = Integer.parseInt(fin, 2);
        return rev;
    }
}
