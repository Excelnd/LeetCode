package solution;

import java.util.LinkedList;
import java.util.Queue;

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

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);
		int count = 0;

		while (!queue.isEmpty()) {

			int size = queue.size();

			while (size > 0) {
				size--;
				TreeNode taken = queue.poll();

				if (taken.left != null) {
					queue.add(taken.left);
				}

				if (taken.right != null) {
					queue.add(taken.right);
				}

			}

			count++;

		}

		return count;
	}

}
