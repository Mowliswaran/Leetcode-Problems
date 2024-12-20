class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        if(s.length()%2==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                continue;
            }
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
                continue;
            }
            else{
                char top=stack.peek();
                if((top=='(' && ch==')')||(top=='[' && ch==']')||(top=='{' && ch=='}')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}