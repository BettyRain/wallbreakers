class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = getBinary(x);
        String str2 = getBinary(y);

        int len1 = str1.length();
        int len2 = str2.length();
        
        if (len2 > len1){
            for (int i=0; i<(len2-len1); i++){
                str1 += "0";
            }
        } else if (len1 > len2) {
            for (int i=0; i<(len1-len2); i++){
                str2 += "0";
            }
        }
        
        return getDifference(str1.toCharArray(), str2.toCharArray());
    }
    
    public String getBinary (int num){
        String result = "";
        while (num>0)  {
          if (num%2 == 1) {
              result += "1"; 
          } else {
              result += "0";  
          }       
          num = num/2;
        }
        return result;
    }
    
    public int getDifference (char [] str1, char [] str2) {
        int count = 0;
        for (int i=0; i<str1.length; i++){
            if (str1[i]!=str2[i]){
                count++;
            }
        }
        return count;
    }
}