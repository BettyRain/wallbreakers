class Solution {
    public int[][] transpose(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int [][] transp = new int [m][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                transp[j][i]=A[i][j];
            }
        }
        return transp;
    }
}