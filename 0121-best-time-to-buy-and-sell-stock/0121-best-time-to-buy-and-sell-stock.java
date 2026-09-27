class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];

        int maxi=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
                maxi=Math.max(maxi, prices[i]-buy);
            }

            buy=Math.min(buy, prices[i]);
        }

        return maxi;
    }
}