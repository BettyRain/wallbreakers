class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> quantity = new HashMap<>();
        String result = "";
        for (char ch : s.toCharArray()) {
            if (quantity.containsKey(ch)) { 
                Integer count = quantity.get(ch);
                count++;
                quantity.put(ch, count);
            } else {
                quantity.put(ch, 1);
            }
        }
        quantity = sortByValue(quantity);
        
        for (Character ch : quantity.keySet()) {
            int n = quantity.get(ch);
            char[] repeat = new char[n];
            Arrays.fill(repeat, ch);
            result += new String(repeat);
        }
        return result;
    }
    
    
    // function to sort hashmap by values 
    public HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) { 
        List<Map.Entry<Character, Integer> > list = 
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
        for (Map.Entry<Character, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}