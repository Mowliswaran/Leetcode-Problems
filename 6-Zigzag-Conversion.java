class Solution {
    public String convert(String s, int n) {
        String st[]=new String[n];
        int j=0;
        int k=0;
        int m=0;
        Arrays.fill(st,"");
        if(s.length()==1 || n==1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            if(j==n){
                k=1;
                m=0;
                j-=2;
            }
            if(j==0){
                m=1;
                k=0;
            }
            if(k==1){
                st[j]=st[j]+String.valueOf(s.charAt(i));
                j--;
            }
            if(m==1){
                st[j]=st[j]+String.valueOf(s.charAt(i));
                j++;
            }
        }
        String strr="";
        for(int i=0;i<st.length;i++){
           // String h=st[i].substring(4,st[i].length());
            strr=strr+st[i];
        }
        return strr;
    }
}