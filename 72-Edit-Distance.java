class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        if(n==0||m==0){
            return n+m;
        }
        int dp[][]=new int[n+1][m+1];
        int j=0;
        for(int i=0;i<n+1;i++){
            dp[i][0]=j;
            j++;
        }
        j=0;
        for(int i=0;i<m+1;i++){
            dp[0][i]=j;
            j++;
        }
        int ans=0;
        for(int i=0;i<n+1;i++){
            for(j=0;j<m+1;j++){
                if(i==0||j==0){
                    continue;
                }
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
                }
                ans=dp[i][j];
            }
        }
        for(int i=0;i<n+1;i++){
            for(j=0;j<m+1;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return ans;
    }
}