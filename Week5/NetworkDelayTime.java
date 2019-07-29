class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
       int[][] graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int k=0;
        for (int[] row: times){
            graph[row[0]-1][row[1]-1] = times[k][2];
            k++;
        }
        
        int[] time = new int[N];
        for (int i=0; i<N; i++){
            time[i] = graph[K-1][i];
        }
        time[K-1] = 0;
        
        boolean[] vertexVis = new boolean[N];
        vertexVis[K-1] = true;
        int index = -1;
        int num = 0;
        for (int i=0; i<N-1; i++){
             num = Integer.MAX_VALUE;
            for (int j=0; j<N; j++){
                if ((vertexVis[j]==false) && (time[j]<num)){
                    num = time[j];
                    index = j;
                }
            }
            if (index == -1) {
                break;
            }
            vertexVis[index] = true;
            
            for (int x=0; x<N; x++){
                if ((graph[index][x] != Integer.MAX_VALUE) && (time[x] > time[index]+graph[index][x])) {
                    time[x] = time[index]+graph[index][x];
                }
            } 
        }
        
        int answer = 0;
        for (int j=0; j<N; j++){
            if (time[j] > answer) {
                answer = time[j];
            }
        }
        
        if (answer == Integer.MAX_VALUE) {
            return -1;
        } else {
            return answer;
        } 
    }
}