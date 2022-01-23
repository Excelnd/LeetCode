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
					FillWaterBFS(grid, rows, cols, i, j);
					count++;
				}
			}
		}

		return count;

	}

	private final int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public void FillWaterBFS(char[][] grid, int rows, int cols, int i, int j) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(i * cols + j); // 2D array to 1D array : currRow * #cols + CurrCol

		grid[i][j] = '0';

		while (!queue.isEmpty()) {

			int idx = queue.poll();

			int row = idx / cols; // 1D array to 2D array for Row : currIndex / #cols
			int col = idx % cols; // 1D array to 2D array for Col : currIndex % #cols

			for (int[] dir : dirs) {
				int x = dir[0] + row;
				int y = dir[1] + col;

				if (x > -1 && x < rows && y > -1 && y < cols && grid[x][y] == '1') {
					grid[x][y] = '0';
					queue.add(x * cols + y);
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
