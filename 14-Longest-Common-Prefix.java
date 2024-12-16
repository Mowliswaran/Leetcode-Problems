class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String st="";
        String str2=strs[strs.length-1];
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)==str2.charAt(i)){
                st+=String.valueOf(str1.charAt(i));
            }
            else{
                break;
            }
        }
        return st;
    }
}