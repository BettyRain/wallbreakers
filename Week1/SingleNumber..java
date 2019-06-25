class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>(); 
        for (int i=0; i<n; i++){
            count = 0;
            if (map1.containsKey(nums[i])) {
                count = map1.get(nums[i]);
                count++;
                map1.put(nums[i], count);
            } else {
                map1.put(nums[i], 1);
            }
        }
        for (Object o : map1.keySet()) {
              if (map1.get(o).equals(1)) {
                return (int)o;
              }
         }
        return 0;
    }
}