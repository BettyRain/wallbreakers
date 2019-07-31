class Solution {
    int [] friends;
    public int findCircleNum(int[][] M) {
        int len = M.length;
        if (len == 0 || M[0].length == 0){
            return 0;
        }
        int result = 0;
        friends = new int[len];
        for (int i=0; i<len; ++i){
            friends[i] = i;
        }
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (M[i][j] == 1){
                    int k = findFriends(i);
                    int m = findFriends(j);
                    friends[k] = m;
                }
            }
        }
        for (int i=0; i<len; i++){
            int l = findFriends(i);
            if (i == l) {
                result++;
            }
        }
        return result;

    }
    
    public int findFriends (int x) {
        if (friends[x] != x) {
            int k = findFriends(friends[x]);
            friends[x] = k;
        }
        return friends[x];
    }
    
}