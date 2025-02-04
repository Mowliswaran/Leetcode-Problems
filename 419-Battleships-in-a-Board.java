class Solution {
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int visit[][]=new int[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X' && visit[i][j]==0){
                    visit[i][j]=1;
                    c++;
                    dfs(i,j,n,m,visit,board);
                }
            }
        }
        return c;
    }
    public void dfs(int i,int j,int n,int m,int visit[][],char board[][]){
        if(i==n || j==m){
            return;
        }
        visit[i][j]=1;
        if(i<n-1 && board[i+1][j]=='X' && visit[i+1][j]!=1)
        dfs(i+1,j,n,m,visit,board);
        if(j<m-1 && board[i][j+1]=='X' && visit[i][j+1]!=1)
        dfs(i,j+1,n,m,visit,board);
    }
}