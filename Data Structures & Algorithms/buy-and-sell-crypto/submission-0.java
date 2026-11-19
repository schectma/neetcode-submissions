class Solution {
    public int maxProfit(int[] prices) {
        /*
        U: Find greatest difference between i-j vals in list (where i < j)
        M: iterate, min/max
        P: Transact immediately, keep track of min and max, keep calcing diff between.
            Return largest
        I:  
        */

        int max_profit = 0;
        int buy = prices[0];
        int sell = prices[0];

        for (int price : prices){
            if(price < buy){
                buy = price;
            } else if (price - buy > max_profit){
                max_profit = price - buy;
            }
        }
        
        return max_profit;
    }
}
