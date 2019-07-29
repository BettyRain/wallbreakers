class Solution {
    boolean [][] visited;
    public boolean exist(char[][] board, String word) {
        int numLetters = board.length * board[0].length;
        if (numLetters < word.length()) {
            return false;
        }
        
        for (int i=0; i<board.length; i++) {
           for (int j=0; j<board[0].length; j++) {
               if (wordExist(board, i, j, word, 0) == true) {
                   return true;
               }
           }
        }
        return false;
    }
    
    public boolean wordExist(char[][] board, int i, int j, String word, int index) {
        if(index == word.length()) {
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        board[i][j] = ' ';
        if ((wordExist(board, i+1, j, word, index+1)) == true) {
            return true;
        } else if ((wordExist(board, i-1, j, word, index+1)) == true) {
            return true;
        } else if ((wordExist(board, i, j+1, word, index+1)) == true) {
            return true;
        } else if ((wordExist(board, i, j-1, word, index+1)) == true) {
            return true;
        }
        
        board[i][j]=word.charAt(index);
        return false; 
    }
}