public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int r = 0;
        char[] ch = str.toCharArray();
        for (int i = 30; i >= 0; i--) {
            // 00000010100101000001111010011100
            ch[r] = str.charAt(i);
            r++;
        }
        
        String fin = new String(ch);
        int rev = Integer.parseInt(fin, 2);
        return rev;
    }
    /*
    Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
Example 2:

Input: 11111111111111111111111111111101
Output: 10111111111111111111111111111111
Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 */

}
