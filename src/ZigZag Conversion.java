class Solution1 {
    public static String convert(String s, int numRows) {
        
          int len= s.length();
          char[][] cArray = new char[len][len];

          int i = 0;
          int j = 0;
          int path = 0;

          while(path < len) {

             if(j != 0) i++;

             while(i < numRows) {
                cArray[i][j] = s.charAt(k);
                System.out.println(cArray[i][j]);
                path++;
                i++;
             }

             i = numRows-1;
              
             if(i <= numRows) {
                while(i != 0 && (path < len)) {
                   i--;
                   j++;              
                   cArray[i][j] = s.charAt(path);
                   path++;
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
    
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		
		System.out.println(convert(s, numRows));

	}
}
