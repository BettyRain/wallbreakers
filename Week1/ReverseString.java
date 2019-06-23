class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char x = 'a';
        for (int i=0; i<n/2; i++){
            x = s[i];
            s[i]=s[n-1-i];
            s[n-i-1] = x;
        }
    }
}