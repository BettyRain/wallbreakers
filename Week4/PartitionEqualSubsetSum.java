class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        
        
        for (int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum%2 != 0) {
            return false;
        }
        
        int partition = sum/2;
        boolean [] resultArr = new boolean[partition + 1];
        resultArr[0] = true;
        
        for (int num : nums){
            for (int j=partition; j>=num; j--){
                resultArr[j] = resultArr[j] || resultArr[j-num];
            }
        }

        return resultArr[partition];
    }
}