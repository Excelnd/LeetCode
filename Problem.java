class Solution {
        public static int myAtoi(String str) {
        
        char[] con = str.toCharArray();
        boolean isNegative = false;
        // "   -42"         Here, -42
        int numPos = 0;
        int sPos = 0;
        
        for (int i = 0; i < con.length; i++) {
            if (!(con[i] >= '0' && con[i] <= '9') && (con[i] != ' ' && con[i] != '-')) {         
           
            sPos++;
            break;
            }
            if (con[i] >= '0' && con[i] <= '9') {
                numPos++;
                break;
            }
        }
        
        if (numPos < sPos) return 0;
        
        char[] to = new char[con.length]; 
        int tedLength = 0;
        
        
        int i = 0; int k = 0;               
        while (i < con.length) {
            if (con[i] == '-') isNegative = true;
            
            if (con[i] >= '0' && con[i] <= '9') {
                to[k] = con[i];
                tedLength++;
                k++;
            }           
            i++;
        }
     
        char[] last = new char[tedLength];
        for(int j = 0; j < last.length; j++) {
            last[j] = to[j];
        }
        
        String L = String.valueOf(last);
        // "4193 with words"        Here, 4193
        
        // "words and 987"      Here, return 0.  

        // "-91283472332"       Here, MAXVAL / MINVAL 
        int ted = Integer.parseInt(L);
        
        if (isNegative) ted = -ted; 
        
        if (ted < Integer.MIN_VALUE / 10) ted = -2147483648;
        if (ted > Integer.MAX_VALUE / 10) ted = 2147483647;            
        
        return ted;        
    }   
}

