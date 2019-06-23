class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        int n = word.length();
        boolean isFirst = false;
        for (int i=0; i<n;i++){
            if (Character.isUpperCase(word.charAt(i))){
               if (i==0){
                   isFirst = true;
               }
               count++;
           }
        }
        if (count == n) {
            return true;
        } else if (count == 0) {
            return true;
        } else if ((count == 1) && (isFirst == true)) {
            return true;
        } else {
            return false;
        }
    }
}