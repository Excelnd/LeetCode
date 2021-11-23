package solution;

public class tempDelete {

	public static void main(String[] args) {
		String s = "disssscovery";
		char[] ca = new char[26];
		for (char c : s.toCharArray()) {
			ca[c - 'a']++;
			
		}
		String keyStr = String.valueOf(ca);
		System.out.println(keyStr);
		
//		for (int i = 0; i < ca.length; i++) {
//			System.out.print(ca[i]);
//		}
		
	}

}
