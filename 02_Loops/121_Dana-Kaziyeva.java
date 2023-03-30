class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        int cur = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            cur = prices[i] - min;
            if(res < cur){
                res = cur;
            }
        }
        return res;
    }
}
