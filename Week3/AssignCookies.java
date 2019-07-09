class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if ((g.length==0) || (s.length==0)){
            return 0;
        }
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0;
        for (int i=0; i<s.length; i++){
            if (s[i]>=g[k]){
                result++;
                k++;
            }
            if (k>g.length-1){
                break;
            }  
        }
        return result;
    }
}