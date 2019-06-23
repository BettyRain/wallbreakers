class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
    //Assumption: matrix is n*n
    //If matrix is n*m; minimum changes should be made
        int n = A.length;
        int [][] B = new int [n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (A[i][j]==1) {
                    B[i][n-j-1]=0;
                } else {
                    B[i][n-j-1]=1;
                }
            }
        }
        return B;
    }
}