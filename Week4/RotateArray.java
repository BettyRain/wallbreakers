class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int [] rotated=new int [n];
        for(int i=0; i<nums.length; i++) {
            rotated[(i+k)%(nums.length)]=nums[i];
        }
        for(int j=0; j<nums.length; j++) {
           nums[j]=rotated[j]; 
        } 
    }
}