class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Map<Integer, Integer> wordsToIndex = new HashMap();
        for (int i = 0; i<len1; i++) {
            wordsToIndex.put(nums1[i], i);
        }
        
        int[] result = new int[len1];
        Arrays.fill(result, -1);
        
        Stack<Integer> stack = new Stack();
        for (int i=0; i<len2; i++) {
            while ((stack.size()>0) && (stack.peek()<nums2[i])) {
                Integer index = wordsToIndex.get(stack.pop());
                if (index != null) {
                    result[index] = nums2[i];
                }
            }
            stack.push(nums2[i]);
        }
        
        return result;
    }
}