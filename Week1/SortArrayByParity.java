class Solution {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        int[]result = new int[n];
        int odd = 0;
        int even = 0;
        
        for (int i=0; i<n; i++) {
            if (A[i]%2==0) {
                result[even] = A[i];
                even++;
            } else {
                odd++;
                result[n-odd] = A[i];
            }
        }
        return result;
    }
}