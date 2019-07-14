class Solution {
    public int[][] merge(int[][] intervals) {
        if ((intervals.length == 1) || (intervals.length == 0)) {
            return intervals;
        }
        List<int[]> result=new ArrayList<>();
        int count = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i=0; i<intervals.length-1; i++){
            if (ifCross(intervals[i],intervals[i+1])){
                int[] borders = getBorders(intervals[i],intervals[i+1]);
                intervals[i+1][0]=borders[0];
                intervals[i+1][1]=borders[1];
            } else {
               result.add(intervals[i]); 
            }
        }
        result.add(intervals[intervals.length-1]);
        
        int [][] answer = new int [result.size()][2];
        for (int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;    
    }
    
    public boolean ifCross (int[] x, int[] y){
        int maxMin = 0;
        int minMax = 0;
        if (x[0]>y[0]) {
            maxMin = x[0];
        } else {
            maxMin = y[0];
        }
            
        if (x[1]<y[1]) {
            minMax = x[1];
        } else {
            minMax = y[1];
        }
            
        if (maxMin <= minMax){
            return true;
        } else {
            return false;
        }
    }
    
    public int[] getBorders (int[] x, int[] y){
        int minMin = 0;
        int maxMax = 0;
        if (x[0]<y[0]) {
            minMin = x[0];
        } else {
            minMin = y[0];
        }
            
        if (x[1]>y[1]) {
            maxMax = x[1];
        } else {
            maxMax = y[1];
        }
        
        int [] arr = new int [2];
        arr[0] = minMin;
        arr[1] = maxMax;
        return arr;
    }
}