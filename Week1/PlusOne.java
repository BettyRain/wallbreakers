class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n-1;
        if (digits[i] != 9) {
            digits[i] = digits[i]+1;
            return digits;
        }
        while (digits[i] == 9) {
            digits[i] = 0;
            i--;
            if (i<0) {
                int [] result = new int [n+1];
                result[0]=1;
                for (int j=1; j<n+1; j++){
                    result[j]=0;
                }
                return result;
            }
        }
        digits[i] = digits[i]+1;
        return digits;
    }
}