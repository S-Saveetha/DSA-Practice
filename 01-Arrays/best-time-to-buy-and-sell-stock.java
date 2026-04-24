// Best Time to buy and Sell Stock
// Pattern: Greedy (Tracking Minimum)
// Approach : Keep track of minimum price and calculate profit at each step
class Solution {
    public int maxProfit(int[] prices) {
       int minprice = prices[0],profit = 0;
       for(int price : prices) {
        if(minprice>price){
            minprice = price;
        }
        else{
            int currentprofit = price-minprice;
            profit=Math.max(profit,currentprofit);
        }
       }
       return profit;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
