class Solution {
    public int maxProfit(int[] prices) {
        if ((prices.length == 0)||(prices.length == 1)){
            return 0;
        }
        int max = prices[1];
        int min = prices[0];
        return profitFunc(prices, max, min, 0);
    }
    
    public int profitFunc (int [] prices, int max, int min, int res) {
        for (int i=0; i<prices.length; i++){
            if ((max-min) > res) {
                res = max-min;
            }
            if ((i<prices.length-1)&&(min > prices[i])) {
                min = prices[i];
                max = prices[i+1];
            } else if (max < prices[i]) {
                max = prices[i];
            }
        }
        if ((max-min) > res) {
                res = max-min;
        }
        if (res>0){
            return res;
        } else {
            return 0;
        }
    }

}
