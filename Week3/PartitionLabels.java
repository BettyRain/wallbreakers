class Solution {
    public List<Integer> partitionLabels(String S) {
        
        List<Integer> result = new ArrayList<Integer>();         
        HashMap<Character, int[]> chars = new LinkedHashMap<>();
        int count = 0;
        int sumAll = 0;
        
        for (int i=0; i<S.length(); i++){
            if (chars.containsKey(S.charAt(i))){
                int [] indexes = chars.get(S.charAt(i));
                indexes[1] = i;
                chars.put(S.charAt(i), indexes);
            } else {
                int[] index = new int[2];
                index[0] = i;
                index[1] = i;
                chars.put(S.charAt(i), index);
            }
        }
        
        int min = 0;
        int max = 0;
        
        
        for (Map.Entry<Character, int[]> entry : chars.entrySet()) {
            count++;
            Character key = entry.getKey();
            int[] value = entry.getValue();
            if ((max<value[1])&&(max>=value[0])){
                max = value[1];
            } else if ((max<value[0]) || (count==chars.size())){
                int sum = max-min+1;
                sumAll +=sum;
                result.add(sum);
                min = value[0];
                max = value[1];
            } 
        }
        if (sumAll < S.length()){
            result.add(S.length()-sumAll);
        }
        
        return result;
    }
}