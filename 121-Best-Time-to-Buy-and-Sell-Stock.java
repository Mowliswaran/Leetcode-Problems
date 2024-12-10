class Solution {
    public int maxProfit(int[] prices) {
        int sum=prices[prices.length-1];
        int max=0;
        for(int i=prices.length-2;i>=0;i--){
            if(sum>prices[i]){
                max=Math.max(max,sum-prices[i]);
            }
            else{
                sum=prices[i];
            }
        }
        return max;
    }
}