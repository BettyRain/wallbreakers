class Solution {
    public int binaryGap(int N) {  
        String[] binary = getBinary(N).split("");
        int count = 0;
        int gap = 0;
        boolean isStart = true;
        for (int i=0; i<binary.length; i++){
            count = 0;
            if (Integer.parseInt(binary[i])==1) {
                int j = i+1;
                while ((j<binary.length) && (Integer.parseInt(binary[j])==0)){
                    count++;
                    j++;
                }
                if (j==binary.length){
                    count = 0;
                } else if (Integer.parseInt(binary[j]) == 1){
                    count++;
                }
                if (count>gap){
                    gap = count;
                }
            }
        }
        return gap;
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
        StringBuilder sb = new StringBuilder(result);
        result = sb.reverse().toString();
        return result;
    }
}