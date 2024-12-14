class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        dp[0]=0;
        Arrays.fill(dp,-1);
        int a=ans(arr,0,n-1,dp);
        int b=ans(arr,1,n-1,dp);
        return Math.max(a,b);
    }
    int ans(int arr[],int i,int n,int dp[]){
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int fs=arr[i]+ans(arr,i+2,n,dp);
        int ss=ans(arr,i+1,n,dp);
        return dp[i]=Math.max(fs,ss);
    }
}