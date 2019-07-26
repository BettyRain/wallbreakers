class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return null;
        }
        int [] arr = new int[2];
        int[] numbers = new int[len];
        for (int i=0; i<len; i++){
            if (numbers[nums[i]-1]>0){
                arr[0]=nums[i];
            } else {
                numbers[nums[i]-1] = nums[i];
            }
        }
        for (int j=0; j<len; j++){
            if (numbers[j]==0){
                arr[1] = j+1;
                break;
            }
        }
        return arr;
    }
}