class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[0]);
            result.add(list);
            return result;
        } else if (nums.length == 0) {
            List<Integer> list = new ArrayList<Integer>();
            result.add(list);
            return result;
        }
        
       permutation(nums, 0);
       return result;
    }
    
    public void permutation (int [] nums, int k) {
        if (k==nums.length) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<nums.length; i++){
                list.add(nums[i]);
            }
            result.add(list);
        } else {
            for (int i=k; i<nums.length; i++){
                int x = nums[k];
                nums[k] = nums[i];
                nums[i] = x;
                
                permutation (nums, k + 1);
                
                x = nums[k];
                nums[k] = nums[i];
                nums[i] = x;
            }
        }       
    }
}