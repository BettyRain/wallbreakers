class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        String part1 = str.substring(0, (str.length()/2));
        String part2 = "";
        if (str.length()%2 == 0){
            part2 = str.substring((str.length()/2));
        } else {
            part2 = str.substring((str.length()/2+1));
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(part2);
        sb = sb.reverse();
        return part1.equals(sb.toString());
    }
}