class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int n = prices.length;
        int buyprice =prices[0];
        for(int i=0;i<n;i++)
        {
           int  Cprofit=prices[i]-buyprice;
           if(Cprofit>maxprofit){
            maxprofit=Cprofit;
           }
           if(prices[i]<buyprice)
           {
            buyprice=prices[i];
           }
        }
        return maxprofit;
    }
}