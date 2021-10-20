import java.util.ArrayList;
import java.util.List;

class Solution1 {
	public static String convert(String s, int numRows) {
		
		if (numRows == 1) return s;
		
		List<StringBuilder> rows = new ArrayList<>();
		
		for (int i = 0; i < Math.min(numRows, s.length()); i++) {	
			rows.add(new StringBuilder());
		}
		
		int currentRow = 0;
		boolean toBottom = false;
		
		for (char c: s.toCharArray()) {
			rows.get(currentRow).append(c);
			if (currentRow == 0 || currentRow == numRows - 1) 
				toBottom = !toBottom;
			currentRow += toBottom ? 1 : -1;
		}
		
		StringBuilder ret = new StringBuilder();
		for (StringBuilder row : rows) ret.append(row);
		return ret.toString();

	}
	
	public static void main(String[] args) {		
		System.out.println(convert("PAYPALISHIRING", 4));
	}

}