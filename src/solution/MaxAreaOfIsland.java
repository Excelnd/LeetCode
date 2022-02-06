package solution;

import java.util.Stack;

public class MaxAreaOfIsland {

	public int maxAreaOfIsland(int[][] grid) {

		boolean[][] alreadySeen = new boolean[grid.length][grid[0].length];

		int[] dirRow = { 1, -1, 0, 0 };

		int[] dirCol = { 0, 0, 1, -1 };

		if (grid.length == 0)
			return 0;

		int maxArea = 0;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == 1 && !alreadySeen[row][col]) {

					int shape = 0;

					Stack<int[]> stack = new Stack();
					stack.push(new int[] { row, col });

					alreadySeen[row][col] = true;

					while (!stack.isEmpty()) {

						int[] node = stack.pop();

						int r = node[0];
						int c = node[1];

						shape++;

						for (int k = 0; k < 4; k++) {
							int nr = r + dirRow[k];
							int nc = c + dirCol[k];
							if (0 <= nr && nr < grid.length && 0 <= nc && nc < grid[0].length &&
									\!alreadySeen[nr][nc] && grid[nr][nc] == 1) {
								stack.push(new int[] { nr, nc });
								alreadySeen[nr][nc] = true;
							}
						}
					}

					maxArea = Math.max(maxArea, shape);
				}
			}

		}

		return maxArea;
	}

}
