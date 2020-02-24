public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        int r = 0;
        char[] ch = str.toCharArray();
        char[] real = new char[31];

        char[] lastChar = new char[31];
        
        for (int i = 0; i < real.length; i++) {
            real[i] = '0';
        }
        System.out.println(real);        
        
        for (int i = 0; i < ch.length; i++) {
            real[i] = ch[i];
        }
        System.out.println(real);        
        
        for (int i = 31; i >= 0; i--) {
            // 00000010100101000001111010011100
            lastChar[r] = real[i];
            r++;
        }
        
        String fin = new String(lastChar);
        int rev = Integer.parseInt(fin, 2);
        return rev;
    }
}
