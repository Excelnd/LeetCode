package solution;

public class MaxAreaOfIsland {
	
	boolean[][] alreadySeen;
	
	public int maxAreaOfIsland(int[][] grid) {

		if (grid.length == 0)
			return 0;

		int maxArea = 0;

		int r = grid.length;
		int c = grid[0].length;

		alreadySeen = new boolean[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (grid[i][j] == 1) {
					int area = DFScountArea(grid, i, j, r, c);
					maxArea = Math.max(maxArea, area);
				}
			}
		}

		return maxArea;

		/*grid = 
	   [[0,0,1,0,0,0,0,1,0,0,0,0,0],
        [0,0,0,0,0,0,0,1,1,1,0,0,0],
        [0,1,1,0,1,0,0,0,0,0,0,0,0],
        [0,1,0,0,1,1,0,0,1,0,1,0,0],
        [0,1,0,0,1,1,0,0,1,1,1,0,0],
        [0,0,0,0,0,0,0,0,0,0,1,0,0],
        [0,0,0,0,0,0,0,1,1,1,0,0,0],
        [0,0,0,0,0,0,0,1,1,0,0,0,0]]
*/    
	}
    
	public int DFScountArea(int[][] grid, int i, int j, int r, int c) {
		
		if (i < 0 || j < 0 || i >= r || j >= c || alreadySeen[i][j] || grid[i][j] == 0) {
			return 0;
		}
		
		alreadySeen[i][j] = true;
		
		int up = DFScountArea(grid, i-1, j, r, c);
		int down = DFScountArea(grid, i+1, j, r, c);
		int left = DFScountArea(grid, i, j-1, r, c);
		int right = DFScountArea(grid, i, j+1, r, c);
		
		return (up + down + left + right + 1);
	}

}
