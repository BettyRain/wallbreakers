class Solution {
    public int findComplement(int num) {
      String result = "";
      while (num>0)  {
          if (num%2 == 1) {
           result += "0"; 
          } else {
              result += "1";  
          }       
          num = num/2;
      }
        StringBuilder sb = new StringBuilder(result);
       return Integer.parseInt(sb.reverse().toString(), 2);
    }
}
