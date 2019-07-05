class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        for (int i=0; i<len1; i++){
            for (int j=0; j<len2; j++){
                if (nums1[i]==nums2[j]){
                    result.put(nums1[i], 1);
                }
            }
        }
        
        int[] arrayRes = new int[result.size()];
        int k=0;
        for (int key : result.keySet()) {
            arrayRes[k] = key;
            k++;
        }
        return arrayRes;

    }
}