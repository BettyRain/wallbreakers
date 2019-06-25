class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        } else if (strs.length==1){
            return strs[0];
        }
        int n = strs.length-1;
        int min = findMinLength(strs);
        StringBuilder sb = new StringBuilder(""); 
        int count = 1;
        boolean isEqual = true;
        int i = 0;
        while (i<min && isEqual){
            count = 0;
            n = strs.length-1;
            while (n>0 && isEqual){
               if (strs[n].charAt(i) == strs[n-1].charAt(i)){
                 count++;
               } else {
                   isEqual=false;
               }
                n--;
                if (count == strs.length-1) {
                    sb.append(strs[n].charAt(i));
                }
            }
            i++;
        }
        return sb.toString();
    }
    
    public int findMinLength(String[] strs){
        int min = strs[0].length();
        for (int i=1; i<strs.length; i++){
            if (strs[i].length()<min) {
                min = strs[i].length();
            }
        }
        return min;
    }
}