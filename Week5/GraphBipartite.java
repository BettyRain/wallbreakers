class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean result = true;
        int [] arr = new int [graph.length];
        for (int i=0; i<graph.length; i++){
            if (arr[i]==0){
                if (dfs(graph, arr, i, 1) == false) {
                    result = false;
                }
            }
        }
        return result;
    }
    
    
    public boolean dfs (int [][] graph, int [] arr, int i, int k){
        if (arr[i]!=0){
            return arr[i] == k;
        }
        arr[i]=k;
        boolean result = true;
        for (int n: graph[i]){
            result = result && dfs(graph, arr, n, -1*k);
        }
        return result;
    }
}