class Solution {
    public String convert(String s, int numRows) {
        
          int len= s.length();
          char[][] cArray = new char[len][len];

          int i = 0;
          int j = 0;

          for(int k = 0; k < len;) {

             if(j != 0) i++;

             while(i < numRows) {
                cArray[i][j] = s.charAt(k);
                System.out.println(cArray[i][j]);
                k++;
                i++;
             }

             i = numRows-1;
              
             if(i <= numRows) {
                while(i != 0 && (k < len)) {
                   i--;
                   j++;              
                   cArray[i][j] = s.charAt(k);
                   k++;
                }

             }

        }
        String re = "";
        
         for (int l=0; l < len; l++) {
            for (int m=0; m < len; m++) {

                re += cArray[l][m];
            }

        } 
        return re;
    }
}
