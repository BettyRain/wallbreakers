//Have to finish without TLE
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        int partition = sum/k;
        if (sum % k != 0){
            return false;
        }
        int [] resArr = new int[k];
        return partitionSub (nums, partition, new int[k], nums.length-1);
        
    }
    
    public boolean partitionSub (int [] nums, int sum, int [] resultArr, int index) {
        if (index == -1) {
            for (int i = 0; i<resultArr.length; i++){
                if (resultArr[i] != sum) {
                    System.out.println("here false");
                    return false;
                }
            }
            return true;
        }
        for (int i=0; i<resultArr.length; i++){
            if ((resultArr[i]+nums[index]) <= sum){
                resultArr[i] = resultArr[i] + nums[index];
                if (partitionSub(nums, sum, resultArr, index-1)) {
                    return true;
                }
                resultArr[i] = resultArr[i] - nums[index];
            }
        }
        return false;
    }
}