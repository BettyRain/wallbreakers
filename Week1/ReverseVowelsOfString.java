class Solution {
    public String reverseVowels(String s) {
        List<Integer> indexes = new ArrayList<>(); 
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                indexes.add(i);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int n = indexes.size();
        for (int j=0; j<n/2; j++){      
            sb.setCharAt(indexes.get(j), s.charAt(indexes.get(n-1-j)));
            sb.setCharAt(indexes.get(n-1-j), s.charAt(indexes.get(j)));
        }
        return sb.toString();
    }
}