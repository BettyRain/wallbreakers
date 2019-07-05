class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> quantity = new HashMap<>();
        HashMap<String, Integer> occur = new HashMap<>(); 
        String[] awords = A.split(" "); 
        String[] bwords = B.split(" ");
        
        for (String aword : awords) {
            if (quantity.containsKey(aword)) { 
                Integer counta = quantity.get(aword);
                counta++;
                quantity.put(aword, counta);
            } else {
                quantity.put(aword, 1);
                occur.put(aword, 1);
            }
        }
        
        for (String bword : bwords) {
            if (quantity.containsKey(bword)) { 
                Integer countb = quantity.get(bword);
                countb++;
                quantity.put(bword, countb);
                occur.put(bword, 2);
            } else {
                quantity.put(bword, 1);
                occur.put(bword, 1);
            }
        }
        
        Integer minimum = Collections.min(quantity.values());
        List<String> result = new ArrayList<String>(); 
        
        for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if ((value == minimum) && (occur.get(key)==1)){
                result.add(key);
            }
        }
        
        return result.toArray(new String[0]);
    }  
}