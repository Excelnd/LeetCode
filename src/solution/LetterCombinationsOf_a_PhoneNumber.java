package solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LetterCombinationsOf_a_PhoneNumber {

	Map<Character, String> phone = new HashMap<Character, String>() {
		{

			put('2', "abc");
			put('3', "def");
			put('4', "ghi");
			put('5', "jkl");
			put('6', "mno");
			put('7', "pqrs");
			put('8', "tuv");
			put('9', "wxyz");
		}
	};

	List<String> result = new LinkedList<>();
	char[] arr;

	public List<String> letterCombinations(String digits) {

		if (digits.length() == 0)
			return result;
		Stack<Character> stack = new Stack<>();

		arr = digits.toCharArray();

		helper(stack, 0);
		return result;
	}

	// DFS
	private void helper(Stack<Character> stack, int index) {

		if (index == arr.length) {
			result.add(convertToStack(stack));
			return;
		}

		String takenString = phone.get(arr[index]);
		for (char cur : takenString.toCharArray()) {
			stack.add(cur);
			helper(stack, index + 1);
			stack.pop();
		}
	}

	private String convertToStack(Stack<Character> stack) {

		Iterator it = stack.iterator();
		StringBuilder str = new StringBuilder();

		while (it.hasNext()) {
			str.append(it.next());
		}
		return str.toString();

	}

}
