class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> map = new HashSet<>();
        for (String str : A){
            String toMap = specEquiv(str, A.length);
            map.add(toMap);
        }
        return map.size();
    }
    
    public String specEquiv (String str, int len) {
        char[] ch = str.toCharArray();
        String first = "";
        String second = "";
        char [] f = new char [len];
        char [] s = new char [len];
        for (int i=0; i<ch.length; i++) {
            if (i%2 == 0){
                first += ch[i];
            } else {
                second += ch[i];
            }
        }
        f = first.toCharArray();
        s = second.toCharArray();
        Arrays.sort(f);
        Arrays.sort(s);
        return String.copyValueOf(f) + String.copyValueOf(s);
    }
}