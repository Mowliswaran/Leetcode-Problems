class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>l1=new ArrayList<>();
        patt(n,"",l1,0,0);
        return l1;
    }
    public void patt(int n,String str,ArrayList<String>l1,int open,int close){
       
    if(str.length()==n*2 && open==n && close==n){
            l1.add(str);
            return;
        }
        if(n*2<=str.length() || open>n || close>n){
             //System.out.println(str+" "+open+" "+close);
            return;
        }
        patt(n,str+'(',l1,open+1,close);
        if(open>close)
        patt(n,str+')',l1,open,close+1);
    }
}