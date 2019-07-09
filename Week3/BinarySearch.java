class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        
        int min = 0;
        int max = len;
        int oldMin = 0;
        int oldMax = len;
        int indexSearch = 0;

        for (int i = 0; i<len; i++){
            indexSearch = indexesSearch(min, max, nums, target);
            if (indexSearch == 3){
                return (min+max)/2;
            } else if (indexSearch == 2) {
                max = (min+max)/2;
                if (max == oldMax){
                    return -1;
                } else {
                    oldMax = max;
                }
            } else {
                min = (min+max)/2;
                if (min == oldMin){
                    return -1;
                } else {
                    oldMin = min;
                }
            }
        }
        
        return -1;
    }
    
    public int indexesSearch (int min, int max, int[] nums, int target){
        int index = (int)Math.round((max+min)/2);
        if (nums[index]<target){
            return 1;
        } else if (nums[index]==target){
            return 3;
        } else {
            return 2;
        }
    }
}