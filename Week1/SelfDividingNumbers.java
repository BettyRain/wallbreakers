class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfNum = new ArrayList<Integer>();
        boolean isSelf = true;
        int n = 0;
        int num = 0;
        for (int i=left; i<=right; i++){
            if (i < 10){
                selfNum.add(i);
            } else if (!(String.valueOf(i).contains("0"))){
                isSelf = true;
                n = String.valueOf(i).length();
                num = i;
                for (int k = 1; k<=n; k++){
                    if (i%(num%10)!=0){
                        isSelf = false;
                    }
                    num = num/10;
                }
                if (isSelf) {
                    selfNum.add(i);
                }
            }

        }
        return selfNum;
    }
}