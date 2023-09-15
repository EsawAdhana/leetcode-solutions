// Question #1: Two Sum
// Time complexity: O(n) && Space complexity: O(1)

class BTTBASS121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - min, maxProfit);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}
