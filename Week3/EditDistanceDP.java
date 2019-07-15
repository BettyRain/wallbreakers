//made using learning video

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] a = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < word1.length()+1; i++) {
            a[i][0] = i;
        }
        for (int j = 0; j < word2.length()+1; j++) {
            a[0][j] = j;
        }
        for (int i = 1; i < word1.length()+1; i++) {
            for (int j = 1; j < word2.length()+1; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    a[i][j] = a[i-1][j-1];
                } else {
                    a[i][j] = Math.min(Math.min(a[i-1][j], a[i][j-1]), a[i-1][j-1])+1;
                }
            }     
        }
        return a[word1.length()][word2.length()];
    }
}