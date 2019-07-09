class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int len = A.length;
        return indexesSearch(len/2, A);
    }
    
    
    public int indexesSearch (int i, int[] nums){
        if (i+1 == nums.length) {
            return i;
        } else if (i-1 < 0) {
            return 0;
        }
        
        if (nums[i]>nums[i+1]){
            if (nums[i]>nums[i-1]){
                return i;
            } else {
                return indexesSearch(i-1, nums);
            }
        } else {
            return indexesSearch(i+1, nums);
        }
    } 
}