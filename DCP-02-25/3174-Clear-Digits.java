class Solution {
    public String clearDigits(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && (s.charAt(i)>='0' && s.charAt(i)<='9')&&(st.peek()>='a' && st.peek()<='z')){
               
                    st.pop();
                
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
       
        while(!st.isEmpty()){
            str=String.valueOf(st.pop())+str;
        }
        return str;
    }
}