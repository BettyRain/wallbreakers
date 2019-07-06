//Time limit exceed. Solution works but slow

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int pLen = p.length();
        for (int i=0; i<s.length()-pLen+1; i++){
            if (sameChars(s.substring(i, i+pLen), p)){
                result.add(i);
            }
        }
        return result;
    }
    
    
    public boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }    
    
}