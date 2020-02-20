class Solution {
    public static int myAtoi(String str) {
        int plusOrMinus = 1;
        int b = 0;
        int i = 0;
        while (str.charAt(i) == ' ') {
            i++;
        }
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            plusOrMinus = str.charAt(i++) == '-' ? -1: 1;
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if ((plusOrMinus > Integer.MAX_VALUE / 10) || 
                    (plusOrMinus == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (plusOrMinus == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            b = 10 * b + (str.charAt(i++) - '0');
        }
    return  b * plusOrMinus;     
    }
             
}
