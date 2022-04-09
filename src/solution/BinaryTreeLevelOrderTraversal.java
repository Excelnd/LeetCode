package solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> lvl = new LinkedList<>();

		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null)
			return lvl;

		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> listArray = new LinkedList<>();

			while (size-- > 0) {

				if (queue.peek().left != null) {
					queue.add(queue.peek().left);
				}

				if (queue.peek().right != null) {
					queue.add(queue.peek().right);
				}
				listArray.add(queue.poll().val);
			}
			lvl.add(listArray);
		}

		return lvl;
	}
}
