class Solution11 {
    public static int myAtoi(String str) {
        if(str.isEmpty()) return 0;
        
        int plusOrMinus = 1;
        int b = 0;
        int i = 0;
        
        while (i < str.length() && str.charAt(i) == ' ') {
            i++; 
        }
        if(i == str.length()) return 0;
        if (str.charAt(i) == '-' || str.charAt(i) == '+') { // if the character is Minus Or Plus
            plusOrMinus = str.charAt(i++) == '-' ? -1 : 1; // if it is Minus then set to Minus / else set to Positive
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') { // Charater is between in 0 to 9 and char index position is is less than String length
            
            /* if the current base = 214748364, then the last digit should be less than or equal to (<=) 7 to be a valid integer,
            otherwise, return Integer.MAX_VALUE and ignore the rest of the characters. beacuse INT_MAX = 2147483647 */
            if (b > Integer.MAX_VALUE / 10 || (b == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (plusOrMinus == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            b = 10 * b + (str.charAt(i++) - '0'); // adding each digit to the container
        }
    return  b * plusOrMinus;     
    }
             
}
