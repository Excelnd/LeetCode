package solution;

public class MaxAreaOfIsland {
	
    public int maxAreaOfIsland(int[][] grid) {
		
    	if(grid.length == 0) return 0;
    	
    	int maxArea = 0;
    	
    	int r = grid.length;
    	int c = grid[0].length;
    	
    	for (int i = 0; i < r; i++) {
    		for (int j = 0; j < c; j++) {
    			if(grid[i][j] == 1) {
    				int area = DFScountArea(grid, i, j, r, c);
    				maxArea = Math.max(maxArea, area); 
    			}
    		}
    	}
    	       
    	return maxArea;
    	
/*grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
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
		
		if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0) {
			return 0;
		}
		
		grid[i][j] = 0;
		
		int up = DFScountArea(grid, i-1, j, r, c);
		int down = DFScountArea(grid, i+1, j, r, c);
		int left = DFScountArea(grid, i, j-1, r, c);
		int right = DFScountArea(grid, i, j+1, r, c);
		
		return (up + down + left + right + 1);
	}

//	public static void main(String[] args) {
//		
//
//	}

}
