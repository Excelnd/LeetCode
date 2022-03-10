package solution;

import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class MaximumDepth_of_BinaryTree {
			 
	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> val = new Stack<>();

		int max = 0;

		stack.push(root);
		val.push(1);

		while (!stack.isEmpty()) {

			TreeNode node = stack.pop();
			int temp = val.pop();

			max = Math.max(max, temp);

			if (node.left != null) {
				stack.push(node.left);
				val.push(temp + 1);

			}

			if (node.right != null) {
				stack.push(node.right);
				val.push(temp + 1);

			}

		}
		return max;
	}

}
