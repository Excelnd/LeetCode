package solution;

import java.util.LinkedList;
import java.util.List;

public class Permutation {

	List<List<Integer>> result = new LinkedList<>();
	
    public List<List<Integer>> permute(int[] nums) {
    	
    	List<Integer> dicisionTree = new LinkedList<>();
        
    	for(int num: nums) {
    		dicisionTree.add(num);
    	}
    	
    	dfs(new LinkedList<>(), dicisionTree);
    	return result;
    }
    
	private void dfs(List<Integer> permutation, List<Integer> dt) {
		
		if (dt.size() == 0) {
			result.add(permutation);
			return;
		}
		
		for (Integer num : dt) {

			List<Integer> tempPermutation = new LinkedList<>(permutation);
			List<Integer> tempDicisionTree = new LinkedList<>(dt);

			tempPermutation.add(num);
			tempDicisionTree.remove(num);
			
//			System.out.print(tempPermutation);
			dfs(tempPermutation, tempDicisionTree);
		}
	}
	
/*	public static void main(String[] args) {
		
		int[] nums = {1,2, 3};
		
		new Permutation().permute(nums);
	}*/
}
