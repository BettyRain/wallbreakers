class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int pLen = p.length();
        char[] pattern = p.toCharArray();
        Arrays.sort(pattern);
        String substr = "";
        for (int i=0; i<s.length()-pLen+1; i++){
            substr = s.substring(i, i+pLen);
            char[] substrChar = substr.toCharArray();
            Arrays.sort(substrChar);
            if (Arrays.equals(pattern, substrChar)) {
                result.add(i);
            }
        }
        return result;
    }    
}