class Solution {
    int [] islands;
    public int numIslands(char[][] grid) {
        int len1 = grid.length;
        if (len1 == 0){
            return 0;
        }
        int len2 = grid[0].length;
        int lenSquare = len1*len2;
        islands = new int[lenSquare];
        for (int i=0; i<lenSquare; i++) {
            islands[i] = i;
        }
        int k = 0;
        int m = 0;
        for (int i=0; i<len1; i++) {
            for (int j=0; j<len2; j++){
                int x = i*len2 + j;
                if (grid[i][j] == '0') {
                    islands[x] = -1;
                    continue;
                }
                if (i!=0 && grid[i-1][j] == '1') {
                    int y = (i-1)*len2 + j;
                    k = findIslands(x);
                    m = findIslands(y);
                    islands[k] = m;
                }
                if (j!=0 && grid[i][j-1] == '1') {
                    int z = i*len2+j-1;
                    k = findIslands(x);
                    m = findIslands(z);
                    islands[k] = m;
                }
            }
        }
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i=0; i<lenSquare; i++){
            if (islands[i] == -1) {
                continue;
            }
            k = findIslands(i);

            if (!map.containsKey(k)) {
                result++;
                map.put(k,k);
            }
        }
        return result;
    }
    
    public int findIslands (int x) {
        if (islands[x] != x) {
            int k = findIslands(islands[x]);
            islands[x] = k;
        }
        return islands[x];
    } 
}