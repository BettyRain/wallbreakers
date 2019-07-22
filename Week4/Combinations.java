class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums = new ArrayList<Integer>(); 

        if (k==0){
            List<Integer> list = new ArrayList<Integer>();
            result.add(list);
            return result;
        }
        
        combinations(nums, k, n, 1);
        return result;
    }
    
    public void combinations(List<Integer> nums, int k, int n, int start) {
        if (nums.size() == k) {
            result.add(new ArrayList<>(nums));
            return;
        }
        
        for (int i=start; i<=n; i++){
            nums.add(i);
            combinations(nums, k, n, i+1);
            nums.remove(nums.size()-1);
        }
    }
}