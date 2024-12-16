class Solution {
    
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       char[]c=s.toCharArray();
       ArrayList<Character>l=new ArrayList<>();
       for(int i=0;i<c.length;i++){
        if((c[i]>='a' && c[i]<='z' )|| (c[i]>='0' && c[i]<='9')){
            l.add(c[i]);
        }
       } 
     
       int b=l.size(),a=0;
       boolean o=false;
       o=ans(l,a,b-1);
       return o;
       
    }
    boolean ans(ArrayList<Character>l,int a,int b){
        
        if(a>b){
            return true;
        }
        
        if(l.get(a)!=l.get(b)){
            return false;
        }
        
        return ans(l,a+1,b-1);
    }
}