package solution;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> set = new HashSet<>(wordList);

		if (!set.contains(endWord))
			return 0;

		Queue<String> queue = new LinkedList<>();

		Set<String> visited = new HashSet<>();

		int chg = 1;
		
		queue.add(beginWord);
		visited.add(beginWord);

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				String word = queue.poll();

				if (word.equals(endWord))
					return chg;

				for (int j = 0; j < word.length(); j++) {
					for (int k = 'a'; k <= 'z'; k++) {
						char[] arr = word.toCharArray();

						arr[j] = (char) k;

						String chkNewWord = new String(arr);

						if (set.contains(chkNewWord) && !visited.contains(chkNewWord)) {
							queue.add(chkNewWord);
							visited.add(chkNewWord);
						}
					}
				}

			}
            if(queue.isEmpty()) return 0;
			chg++; // Changes
		}

		return chg;
	}

}
