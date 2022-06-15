package solution;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	
	int[] preOrder;
	int[] inOrder;
	Map<Integer, Integer> hm = new HashMap<>();	
	int index = 0; 
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	preOrder = preorder;
    	inOrder = inorder;
    	
 	
    	int n = preOrder.length;
    	
    	for (int i = 0; i < n; i++) {
    		hm.put(inOrder[i], i);
    	}
    	
    	TreeNode root = dfs(0, n - 1);
    	
        return root;
    }

	private TreeNode dfs(int start, int end) {
		
		if (start > end) return null;
		
		int curVal = preOrder[index++];
		TreeNode cur = new TreeNode(curVal);
		
		int mid = hm.get(curVal);
		
		// build left subtree
		cur.left = dfs(start, mid - 1);
		
		
		// build right subtree
		cur.right = dfs(mid + 1, end);
		
		return cur;
	}
}
