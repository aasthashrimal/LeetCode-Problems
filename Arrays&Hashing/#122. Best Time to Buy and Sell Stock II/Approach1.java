class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int cp, sp;
        int n = prices.length;

        for(int i=0; i<n; i++){
            while(i<n-1 && prices[i+1]<prices[i]) i++;
            cp = prices[i];
            while(i<n-1 && prices[i+1]>prices[i]) i++;
            sp = prices[i];
            profit += sp-cp;
        }
        return profit;
    }
}
