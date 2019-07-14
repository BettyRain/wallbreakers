class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        } else if (nums.length == 1){
            return nums[0];
        } else if (nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int sum1 = nums[0];
        sum1 += roundRob(nums, 2, nums.length-1);
        int sum2 = roundRob(nums, 1, nums.length);
        return Math.max(sum1, sum2);
    }
    
    public int roundRob(int[] nums, int first, int n) {
        int left = 0;
        int right = 0;
        int x = 0;
        for (int i=first; i<n; i++) {
            x = left;
            left = Math.max(left,right);
            right = nums[i] + x;
        }
        return Math.max(left, right);
    }
}