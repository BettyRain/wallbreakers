class Solution {
    public int maxProfit(int[] prices) {
        if ((prices.length == 0)||(prices.length == 1)){
            return 0;
        }
        int max = prices[1];
        int min = prices[0];
        return profitFunc(prices, max, min, 0, 0);
    }
    
    public int profitFunc (int [] prices, int max, int min, int i, int res) {
        if ((max-min) > res) {
            res = max-min;
        }
        if (i>=prices.length) {
            if (res>0){
                return res;
            } else {
                return 0;
            }
        }

        if ((i<prices.length-1)&&(min > prices[i])) {
            min = prices[i];
            max = prices[i+1];
        } else if (max < prices[i]) {
            max = prices[i];
        }
        return profitFunc (prices, max, min, i+1, res);
    }
}
