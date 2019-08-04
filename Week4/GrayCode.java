class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            result.add(0);
            return result;
        } else if (n == 1) {
            result.add(0);
            result.add(1);
            return result;
        }
        double count = Math.pow(2, n);
        for (int i=0; i<count; i++){
            result.add(i^i>>1);
        }
        return result;
    }
}