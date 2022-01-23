package solution;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

	public int numIslands(char[][] grid) {

		if (grid.length == 0) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					FillWaterBFS(grid, i, j);
					count++;
				}
			}
		}

		return count;

	}

	// int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public void FillWaterBFS(char[][] grid, int x, int y) {

		grid[x][y] = '0';

		LinkedList<Integer> queue = new LinkedList<>();

		int n = grid.length;
		int m = grid[0].length;

		int cvtCode = x * m + y;
		queue.offer(cvtCode);

		while (!queue.isEmpty()) {

			cvtCode = queue.poll();

			int i = cvtCode / m;
			int j = cvtCode % m;

			if (i > 0 && grid[i - 1][j] == '1') { // Search Upward
				queue.offer((i - 1) * m + j);
				grid[i - 1][j] = '0';
			}

			if (i < n - 1 && grid[i + 1][j] == '1') { // Search Downward
				queue.offer((i + 1) * m + j);
				grid[i + 1][j] = '0';
			}

			if (j > 0 && grid[i][j - 1] == '1') {	// Search Left
				queue.offer(i * m + j - 1);
				grid[i][j - 1] = '0';
			}

			if (j < m - 1 && grid[i][j + 1] == '1') {	// Search Right
				queue.offer(i * m + j + 1);
				grid[i][j + 1] = '0';
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
