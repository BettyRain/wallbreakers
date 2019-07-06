class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int [] numbersRows = new int [10];
        int [] numbersCol = new int [10];
        int [] numbersSquare1 = new int [10];
        int [] numbersSquare2 = new int [10];
        int [] numbersSquare3 = new int [10];
        
        Arrays.fill(numbersRows, 0);
        Arrays.fill(numbersCol, 0);
        Arrays.fill(numbersSquare1, 0);
        Arrays.fill(numbersSquare2, 0);
        Arrays.fill(numbersSquare3, 0);
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (board[i][j]!='.'){
                    int k = Character.getNumericValue(board[i][j]);
                    numbersRows[k]++;
                    if (numbersRows[k]>1){
                        return false;
                    }
                }
                if (board[j][i]!='.'){
                    int k = Character.getNumericValue(board[j][i]);
                    numbersCol[k]++;
                    if (numbersCol[k]>1){
                        return false;
                    }
                }
                if (board[i][j]!='.') {
                    if (j<3){
                        int k = Character.getNumericValue(board[i][j]);
                        numbersSquare1[k]++;
                        if (numbersSquare1[k]>1){
                        return false;
                        }
                    } else if (j<6){
                        int k = Character.getNumericValue(board[i][j]);
                        numbersSquare2[k]++;
                        if (numbersSquare2[k]>1){
                            return false;
                        }
                    } else {
                        int k = Character.getNumericValue(board[i][j]);
                        numbersSquare3[k]++;
                        if (numbersSquare3[k]>1){
                            return false;
                        }
                    }
                }
                
            }
            if ((i+1)%3==0){
                Arrays.fill(numbersSquare1, 0);
                Arrays.fill(numbersSquare2, 0);
                Arrays.fill(numbersSquare3, 0); 
            }
            Arrays.fill(numbersRows, 0);
            Arrays.fill(numbersCol, 0);
        }
        
        
        return true;
    }
}