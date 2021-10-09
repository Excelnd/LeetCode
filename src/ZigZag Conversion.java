import java.util.ArrayList;
import java.util.List;

class Solution1 {
	public static String convert(String s, int numRows) {
		
		if (numRows == 1) return s;
		
		List<StringBuilder> rows = new ArrayList<>();
		
		for (int i = 0; i < Math.min(numRows, s.length()); i++) {	
			rows.add(new StringBuilder());
		}
		
		List<String> stringRows = new ArrayList<>();
		
		stringRows.add("thabastian");
		stringRows.add("jabast");
		return s;
		
//		return con.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("dklfajd");
		List<StringBuilder> rows = new ArrayList<>();
		
		
		for (int i = 0; i < Math.min(3, 8); i++) {	
			rows.add(new StringBuilder());
		}
		
		List<String> stringRows = new ArrayList<>();
		
		stringRows.add("thabastian");
		stringRows.add("jabast");
		
	}

}