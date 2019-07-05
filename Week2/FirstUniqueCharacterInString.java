class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> quantity = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            if (quantity.containsKey(ch)) { 
                Integer count = quantity.get(ch);
                count++;
                quantity.put(ch, count);
            } else {
                quantity.put(ch, 1);
            }
        }
        
         for (Map.Entry<Character, Integer> entry : quantity.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                return s.indexOf(key);
            }
        }
        
        return -1;
    }
}