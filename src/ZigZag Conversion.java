class Solution1 {
	public static String convert(String s, int numRows) {

		int len = s.length();
		char[][] cArray = new char[len][len];

		int i = 0;
		int j = 0;
		int path = 0;
		
		if(s.length() == 1 || s.length() == 0) return s;

		while (path < len) {

			if (j != 0)
				i++;

			while (i < numRows && (path < len)) { // "PAYPALISHIRING"
				cArray[i][j] = s.charAt(path);
				System.out.print(cArray[i][j]);
				path++;
				i++;
			}
			i = numRows-1;

			if (i <= numRows) {
				while (i != 0 && (path < len)) {
					i--;
					j++;
					cArray[i][j] = s.charAt(path);
					System.out.print(cArray[i][j]);
					path++;
				}

			}
		}
		System.out.println();

		String re = "";

		for (int l = 0; l < len; l++) {
			for (int m = 0; m < len; m++) {

				if(cArray[l][m] != '\u0000') {
					re += cArray[l][m];
				}
				
			}
			
		}
		return re;
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 4;

		System.out.println(convert(s, numRows));

	}
}
