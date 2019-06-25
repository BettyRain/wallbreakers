class Solution {
    public int titleToNumber(String s) {
        int n = s.length();
        int result = 0; 
        for (int i = 0; i < n; i++) 
        { 
            result *= 26; 
            result += s.charAt(i) - 'A' + 1; 
        } 
        return result; 
    }
}