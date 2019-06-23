class Solution {
    public String reverseWords(String s) {
        String[] strSplit = s.split(" ");
        int num = strSplit.length;
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<num; i++) {
            sb.append(strSplit[i]);
            sb = sb.reverse();
            if (i == num-1) {
               result = result+ sb.toString(); 
            } else {
                result = result+ sb.toString() + " ";
            }
            sb.setLength(0);
        }
        return result;
    }
}