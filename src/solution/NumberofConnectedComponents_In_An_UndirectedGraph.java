package solution;

import java.util.HashSet;
import java.util.Set;

public class NumberofConnectedComponents_In_An_UndirectedGraph {

	public int countComponents(int n, int[][] edges) {		
		
		int[] ids = new int[n];
		
		for (int i = 0; i < ids.length; i++) {
			ids[i] = i;
		}
		
		for (int[] edge: edges) {
			union(edge[0], edge[1], ids);			
		}
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < ids.length; i++) {
			set.add(find(ids[i], ids));
		}
	
		System.out.println(set.size());
		return set.size();
	}
	
	// Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.
	//                 index =   0, 1 ,  2, 3 ,  4, 5
	
	private void union(int edge1, int edge2, int[] ids) {
		int parent1 = find(edge1, ids);
		int parent2 = find(edge2, ids);
		ids[parent1]= parent2;
	}
	
	private int find(int edge, int[] ids) {
		if(ids[edge] != edge) ids[edge] = find(ids[edge], ids);
		return ids[edge];
		
	}
	
/*	public static void main(String[] args) {
		NumberofConnectedComponents_In_An_UndirectedGraph numOfCCU =
				new NumberofConnectedComponents_In_An_UndirectedGraph();
		
		int n  = 5;
		int[][] edges = { {0,1},{1,2}, {3,4} };
		
		numOfCCU.countComponents(n, edges);
	}
*/
	
}
