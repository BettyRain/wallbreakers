class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        int min = n;
        while (sum>3) {
        int i = 0;
            while (n>0){
                i += (n%10)*(n%10);
                n = n/10;
            }
            sum = i;
            n=i;
            
            if (n<min){
                min = n;
            } else if (n==min){
                return false;
            }
        }
        if (sum == 1){
            return true;
        } else {
            return false;
        }
    }
}