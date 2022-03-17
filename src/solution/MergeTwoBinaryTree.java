package solution;

import java.util.Deque;
import java.util.LinkedList;

class MergeTwoBinaryTree {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

		if (root1 == null)
			return root2;

		Deque<TreeNode[]> stack = new LinkedList<>();

		stack.offerLast(new TreeNode[] { root1, root2 });

		while (!stack.isEmpty()) {

			TreeNode[] cur = stack.pollLast();

			if (cur[1] == null) {
				continue;
			}

			cur[0].val += cur[1].val;

			if (cur[0].left == null) {
				cur[0].left = cur[1].left;
			} else {
				stack.offerLast(new TreeNode[] { cur[0].left, cur[1].left });
			}

			if (cur[0].right == null) {
				cur[0].right = cur[1].right;
			} else {
				stack.offerLast(new TreeNode[] { cur[0].right, cur[1].right });
			}

		}

		return root1;
	}

}
