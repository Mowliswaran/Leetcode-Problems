class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>set=new HashSet<>();
        Set<Character>set1=new HashSet<>();
        for(int i=0;i<9;i++){
            set.clear();
            set1.clear();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                if(!set.add(board[i][j])){
                    return false;
                }
                }
                if(board[j][i]!='.')
                if(!set1.add(board[j][i])){
                    return false;
                }
            }
        }
       set.clear();
        int i=0;
        int j=0;
        while(i+3<=9){
            j=0;
            while(j+3<=9){
                
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(board[k][l]!='.'){
                        if(!set.add(board[k][l])){
                            return false;
                        }}
                                    // System.out.println("q");
                    }
                }
                j+=3;
                
                set.clear();
            }
            i+=3;
        }
        return true;
    }
}