class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, List<Integer>> indexes1 = new HashMap<>();
        HashMap<Character, List<Integer>> indexes2 = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            if (indexes1.containsKey(ch)) { 
                List<Integer> count = indexes1.get(ch);
                count.add(i);
                indexes1.put(ch, count);
            } else {
                List<Integer> countNew = new ArrayList<Integer>();
                countNew.add(i);
                indexes1.put(ch, countNew);
            }
            if (indexes2.containsKey(ch2)) { 
                List<Integer> count2 = indexes2.get(ch2);
                count2.add(i);
                indexes2.put(ch2, count2);
            } else {
                List<Integer> countNew2 = new ArrayList<Integer>();
                countNew2.add(i);
                indexes2.put(ch2, countNew2);
            }
        }
        
        if (indexes1.size()!=indexes2.size()){
            return false;
        }
        
        int k = 0;
        for (List<Integer> list1 : indexes1.values()) {
            for (List<Integer> list2 : indexes2.values()) {
                if (list1.equals(list2)){
                    k++;
                }
            }
        }
        if (k==indexes1.size()){
            return true;
        } else {
            return false;
        }
    }
}