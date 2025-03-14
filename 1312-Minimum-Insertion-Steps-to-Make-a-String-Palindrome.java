class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        String t="";
        for(int i=0;i<n;i++){
            t=String.valueOf(s.charAt(i))+t;
        }
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][n];
    }
}