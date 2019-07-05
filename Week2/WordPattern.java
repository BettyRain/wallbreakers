class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, List<Integer>> indexes1 = new HashMap<>();
        HashMap<String, List<Integer>> indexes2 = new HashMap<>();
        String[] ch2 = str.split(" ");
        if (pattern.length() != ch2.length){
            return false;
        }
        for (int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if (indexes1.containsKey(ch)) { 
                List<Integer> count = indexes1.get(ch);
                count.add(i);
                indexes1.put(ch, count);
            } else {
                List<Integer> countNew = new ArrayList<Integer>();
                countNew.add(i);
                indexes1.put(ch, countNew);
            }
            if (indexes2.containsKey(ch2[i])) { 
                List<Integer> count2 = indexes2.get(ch2[i]);
                count2.add(i);
                indexes2.put(ch2[i], count2);
            } else {
                List<Integer> countNew2 = new ArrayList<Integer>();
                countNew2.add(i);
                indexes2.put(ch2[i], countNew2);
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