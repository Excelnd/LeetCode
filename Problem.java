class Solution {
    public static int myAtoi(String str) {
        int plusOrMinus = 1,
        int b = 0;
        int i = 0;
        while (str[i] == ' ') {
            i++;
        }
        while(str[i] == '-' || str[i] == '+') {
            plusOrMinus = 1 - 2 * (str[i++] == '-');
        }
    }   
}
