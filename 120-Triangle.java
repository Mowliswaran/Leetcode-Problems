class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        int n=tri.size();
        int m=tri.get(n-1).size();
        int dp[][]=new int[m][m];
        dp[0][0]=tri.get(0).get(0);
        for(int i=1;i<m;i++){
            for(int j=0;j<=i;j++){
                if(j==0)dp[i][j]=tri.get(i).get(j)+dp[i-1][j];
                if(j==i){
                    dp[i][j]=tri.get(i).get(j)+dp[i-1][j-1];
                }
                else if(j>0)
                dp[i][j]=tri.get(i).get(j)+Math.min(dp[i-1][j],dp[i-1][j-1]);
              
                
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(dp[n-1][i],min);
        }
        return min;
    }
}