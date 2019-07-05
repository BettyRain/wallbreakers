class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> quantityS = new HashMap<>();
        HashMap<Character, Integer> quantityT = new HashMap<>();
        
        int len = t.length();
        for (int i=0; i<len; i++){
            if (s.indexOf(t.charAt(i)) == -1) {
                return t.charAt(i);
            } else {
                if (quantityT.containsKey(t.charAt(i))) { 
                    Integer counta = quantityT.get(t.charAt(i));
                    counta++;
                    quantityT.put(t.charAt(i), counta);
                } else {
                    quantityT.put(t.charAt(i), 1);
                }
                
                if(i!= len-1){
                   if (quantityS.containsKey(s.charAt(i))) { 
                        Integer countb = quantityS.get(s.charAt(i));
                        countb++;
                        quantityS.put(s.charAt(i), countb);
                    } else {
                        quantityS.put(s.charAt(i), 1);
                    } 
                }
                
            }
        }
        
        for (Character k : quantityS.keySet()) {
            if (!quantityS.get(k).equals(quantityT.get(k))) {
                return k;
            }
        }
        
        return t.charAt(len-1);
    }
}
//Question: how I can make it faster?