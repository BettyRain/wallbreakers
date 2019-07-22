class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 1 << len; ++i) {
            List<Integer> x = new ArrayList<>();

            for (int j = 0; j < len; ++j) {
                if (((i >> j) & 1) == 1) {
                    x.add(nums[j]);
                }
            }
            result.add(x);
        }

        return result;
    }
}