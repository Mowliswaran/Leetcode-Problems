class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        sum=0
        for i in range(len(prices)):
            if(i!=0):
                if(prices[i-1]<prices[i]):
                    sum=sum+(prices[i]-prices[i-1])
        return (sum)