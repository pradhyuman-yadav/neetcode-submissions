class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int max = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < prices.length; windowEnd++){
            if(prices[windowEnd] - prices[windowStart] > max) {
                max = prices[windowEnd] - prices[windowStart];
                // windowStart = windowEnd;
            }

            if(prices[windowEnd] < prices[windowStart]) {
                windowStart = windowEnd;
            }
        }
        System.out.println(max);
        return max;
    }
}
