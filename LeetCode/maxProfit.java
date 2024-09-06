class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) // only 1 day, cannot buy and sell on the same day
            return 0; 
        
        int bigProfit = Integer.MIN_VALUE; 
        int lowPrice = Integer.MAX_VALUE; 
       // int lowIndex = -1;

        for(int i = 0; i < prices.length; i++) { // findLowestValue
            if(prices[i] < lowPrice) {
                lowPrice = prices[i];
                //lowIndex = i; 
            }

            if(prices[i] - lowPrice > bigProfit)
                bigProfit = prices[i] - lowPrice;
        }

        return bigProfit;
    }
}
