package solution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {

		int frquency[] = new int[26];

		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			frquency[ch[i] - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (frquency[ch[i] - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}
/*
	public static void main(String[] args) {

		new FirstUniqueCharacterInAString().firstUniqChar("loveleetcode");
	}
*/
}
