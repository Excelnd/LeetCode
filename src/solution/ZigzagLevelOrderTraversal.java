package solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();

		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null) {
			return res;
		}

		queue.add(root);

		boolean zigzagFlag = false;

		while (!queue.isEmpty()) {
			int size = queue.size();
			LinkedList<Integer> eachLevel = new LinkedList<>();

			for (int i = 0; i < size; i++) {

				TreeNode node = queue.poll();

				if (zigzagFlag) {
					eachLevel.addFirst(node.val);
				}

				else {
					eachLevel.add(node.val);
				}

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}
			res.add(eachLevel);
			zigzagFlag = !zigzagFlag;
		}

		return res;
    }
}
