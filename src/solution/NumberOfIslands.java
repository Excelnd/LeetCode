package solution;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

	public int numIslands(char[][] grid) {

		if (grid.length == 0) {
			return 0;
		}

		int count = 0;
		
		int rows = grid.length;
		int cols = grid[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1') {
					FillWaterDFS(grid, i, j);
					count++;
				}
			}
		}
		
//		System.out.println(count);
		return count;

	}
	public void FillWaterDFS(char[][] grid, int i, int j) {

		if(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
			grid[i][j] = '0';	
			FillWaterDFS(grid, i-1, j);			
			FillWaterDFS(grid, i+1, j);			
			FillWaterDFS(grid, i, j-1);			
			FillWaterDFS(grid, i, j+1);			
		}

	}
	
//	public static void main(String[] args) {
//		
//		char[][] grid = {
//				{'1','1','1','1','0'},
//				{'1','1','0','1','0'},
//				{'1','1','0','0','0'},
//				{'0','0','0','0','0'}
//				};
//		
//		new NumberOfIslands().numIslands(grid);
//		
//	}

}
