class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] result = new String [words.length];
        Arrays.fill(result, "");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0; i<words.length; i++){
            for (int j=0; j<words[i].length(); j++){
                int k = alphabet.indexOf(words[i].charAt(j));
                result[i] += morse[k];
            }
        }
        HashMap<String , Integer> wordsFreq = new HashMap<String , Integer>();
        for (String word : result) {
            if (wordsFreq.containsKey(word)) { 
                Integer count = wordsFreq.get(word);
                count++;
                wordsFreq.put(word, count);
            } else {
                wordsFreq.put(word, 1);
            }
        }
        return wordsFreq.size();
    }
}