class Solution {
    public int findMinArrowShots(int[][] points) {
        int result = 0;
        int count = 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i=0; i<points.length-1; i++){
            int maxMin = 0;
            int minMax = 0;
            if (points[i][0]>points[i+1][0]) {
                maxMin = points[i][0];
            } else {
                maxMin = points[i+1][0];
            }
            
            if (points[i][1]<points[i+1][1]) {
                minMax = points[i][1];
            } else {
                minMax = points[i+1][1];
            }
            
            if (maxMin <= minMax){
                points[i+1][0] = maxMin;
                points[i+1][1] = minMax;
                result ++;
                count = count + 2;
            }
        }
        result += points.length-count;
        return result;    
    }
}