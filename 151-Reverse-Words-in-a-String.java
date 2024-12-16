class Solution {
    public String reverseWords(String s) {
        ArrayList<String>l=new ArrayList<>();
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                if(ans!="")
                l.add(ans);
                ans="";
            }
            else{
            ans=ans+String.valueOf(s.charAt(i));}
        }
        l.add(ans);
        ans="";
        for(int i=l.size()-1;i>=0;i--){
           ans=ans+l.get(i);
           ans=ans+" ";
        }
        return ans.trim();
    }
}