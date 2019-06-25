class Solution {
    public boolean isAnagram(String s, String t) {
        int n = 0;
        if (s.length()!=t.length()){
            return false;
        } else {
            n = s.length();
        }
        int countS = 0;
        int countT = 0;
        
        HashMap<Character, Integer> map1 = new HashMap<>(); 
        HashMap<Character, Integer> map2 = new HashMap<>(); 
        for (int i=0; i<n; i++){
            countS = 0;
            countT = 0;
            if (map1.containsKey(s.charAt(i))) {
                countS = map1.get(s.charAt(i));
                countS++;
                map1.put(s.charAt(i), countS);
            } else {
                map1.put(s.charAt(i), 1);
            }
            if (map2.containsKey(t.charAt(i))) {
                countT = map2.get(t.charAt(i));
                countT++;
                map2.put(t.charAt(i), countT);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }
        return map1.equals(map2);
    }
}