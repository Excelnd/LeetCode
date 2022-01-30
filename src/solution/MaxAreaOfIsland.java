package solution;

public class MaxAreaOfIsland {
	
	
	public int maxAreaOfIsland(int[][] grid) {
		
		boolean[][] alreadySeen = new boolean[grid.length][grid[0].length];
		
		int[] dirRow = { 1, -1, 0 , 0};
		
		int[] dirCol = { 0, 0, 1 , -1};

		if (grid.length == 0)
			return 0;

		int maxArea = 0;
		
		
		
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


}
