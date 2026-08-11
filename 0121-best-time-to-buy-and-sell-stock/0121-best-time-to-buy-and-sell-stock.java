class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            int cprofit=prices[i]-buyprice;
            if(cprofit> maxprofit)
            {
                maxprofit=cprofit;
            }
            if(prices[i]<buyprice)
            {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
}