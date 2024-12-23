class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int c=1;
        String str=\\;
        for(int i=0;i<n-1;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            else{
                if(c==1){
                    str+=String.valueOf(chars[i]);
                }
                else if(c%10==c){
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
                else if(c%100==c){
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
                else{
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
                c=1;
            }
        }
        if(n>1 && chars[n-1]!=chars[n-2]){
      
            c=1;
        }
        int i=n-1;
        if(c==1){
                    str+=String.valueOf(chars[i]);
                }
                else if(c%10==c){
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
                else if(c%100==c){
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
                else{
                    str+=String.valueOf(chars[i]);
                    str+=String.valueOf(c);
                }
       // System.out.println(str);
        for(i=0;i<str.length();i++){
            chars[i]=(str.charAt(i));
        }
        return str.length();
    }
}