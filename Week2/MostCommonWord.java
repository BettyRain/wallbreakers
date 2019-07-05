class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> quantity = new HashMap<>();

        paragraph = paragraph.toLowerCase();
        String [] paragraphArr = paragraph.split("[^a-zA-Z]+");

        for (String word : paragraphArr) {
            if (quantity.containsKey(word)) { 
                Integer count = quantity.get(word);
                count++;
                quantity.put(word, count);
            } else {
                quantity.put(word, 1);
            }
        }
        Integer max = 0;
        String result = "";
        
        for (Map.Entry<String, Integer> entry : quantity.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value>max) {
                if (!isBanned(key, banned)) {
                    max = value;
                    result = key;
                }
            }
        }        
        return result;
    }
    
    public boolean isBanned (String value, String[] banned){
        for (String s: banned) {
            if (s.equals(value))
                return true;
        }
        return false;
    }
}

//How can be faster?