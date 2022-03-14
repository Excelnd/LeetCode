package solution;

import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoBinaryTree {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1 == null) return root2;
     
        Queue<TreeNode[]> q = new LinkedList<>();
        
        q.offer(new TreeNode[] {root1, root2});

        
        while (!q.isEmpty()) {

            TreeNode[] nodes = q.poll();  
            
            if(nodes[1] == null) {
                continue;
            }
            
            nodes[0].val += nodes[1].val;
            
            if(nodes[0].left == null) {
                nodes[0].left = nodes[1].left; 
            } else {
                q.offer(new TreeNode[] {nodes[0].left, nodes[1].left});
            }
            
            if(nodes[0].right == null) {
    
                nodes[0].right = nodes[1].right;
            } else {
                q.offer(new TreeNode[] {nodes[0].right, nodes[1].right});
            }
           
            
        }
        return root1;
	}
}
