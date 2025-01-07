class Solution {
    public String removeTrailingZeros(String num) {
        int c=0;
        String s="";
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                c=1;
            }
            if(c==1){
                s=String.valueOf(num.charAt(i))+s;
            }
        }
        return s;
    }
}