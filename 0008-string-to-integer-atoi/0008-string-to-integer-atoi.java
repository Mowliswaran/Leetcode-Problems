class Solution {
    public int myAtoi(String s) {
        int sign=0;
        int z=0;
        long ans=0;
        int zz=0;
        int p=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(c=='.'){
                break;
            }
            if(c=='+'){
                if(p==1 || sign==1 || zz==1){
                    break;
                }
                else {p=1;continue;}
                
            }
            if(c==' '){
                if(p!=0 || z!=0 || zz!=0 || sign!=0){
                    break;
                }
                continue;
            }
            if(c=='-'){
                if(sign==1 || p==1 || z==1){
                    break;
                }
                if(zz==1){
                    break;
                }
                sign=1;
            }
            if(c=='0'){
                zz=1;
                if(z==0){
                    continue; 
                }
            }
            if(c>='0' && c<='9'){
                z=1;
                ans=ans*10+(c-'0');
                if(ans>Integer.MAX_VALUE)break;
            }
            if((c>='a' && c<='z') || (c<='A' && c>='Z')){
                break;
            }
           
        }
        if(sign==1 && ans-1>=Integer.MAX_VALUE) return Integer.MIN_VALUE;
        if(ans>Integer.MAX_VALUE)
        ans=Integer.MAX_VALUE;
        
        if(sign==1)return (int)(-1*ans);
        return (int)ans;
    }
}