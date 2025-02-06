class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int a=Integer.MAX_VALUE;
                int b=Integer.MAX_VALUE;
                int c=Integer.MAX_VALUE;
                if(j>0)a=matrix[i-1][j-1];
                b=matrix[i-1][j];
                if(j<n-1)c=matrix[i-1][j+1];
                matrix[i][j]=Math.min(a,Math.min(b,c))+matrix[i][j];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,matrix[n-1][i]);
        }
        return min;
    }
}