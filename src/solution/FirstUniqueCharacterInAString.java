package solution;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {

		Map<Character, Integer> countInHashMap = new HashMap<Character, Integer>();

		// Input: s = "loveleetcode"

		for (char c : s.toCharArray()) {
			countInHashMap.put(c, countInHashMap.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (countInHashMap.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}

}
