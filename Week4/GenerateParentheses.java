class Solution {
    List<String> result;
    int N;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();
        N = n;
        generator(0, 0, "");
        return result;
    }
    
    public void generator(int left, int right, String res) {
        if (res.length() == N*2) {
            result.add(new String(res));
        } else {
            if (left < N) {
                generator(left+1, right, res + "(");
           }
            if (right < N && right < left) {
                generator(left, right+1, res + ")");
            } 
        }
    }
}