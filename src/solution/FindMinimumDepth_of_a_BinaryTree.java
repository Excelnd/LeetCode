package solution;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinimumDepth_of_a_BinaryTree {
	public int minDepth(TreeNode root) {

		if (root == null)
			return 0;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		int sPath = 1;

		while (!queue.isEmpty()) {

			int size = queue.size();

			while (size-- > 0) {

				TreeNode node = queue.poll();

				if ((node.left == null) && (node.right == null))
					return sPath;

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}

			}

			sPath++;
		}

		return sPath;
	}
}
