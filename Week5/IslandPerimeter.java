class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0){
            return 0;
        }
        int result = 0;
        int cells = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]==1) {
                    cells = 4;
                    if (i-1 >= 0 && grid[i-1][j]==1){
                        cells--;
                    }
                    if (j-1 >= 0 && grid[i][j-1]==1){
                        cells--;
                    }
                    if (i+1 < grid.length && grid[i+1][j]==1){
                        cells--;
                    }
                    if (j+1 < grid[i].length && grid[i][j+1]==1){
                        cells--;
                    }
                    result = result + cells;
                }
            }
        }
        return result;
    }
}