class Solution {
    public void rotate(int[][] matrix) {
        int n=0;
        int l=matrix.length;
        n=matrix.length;
        int m=n-1;
        
        int [][]arr=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][m]=matrix[i][j];
            }
            m--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}