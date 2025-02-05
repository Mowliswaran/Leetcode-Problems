class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int arr[]=new int[26];
        int c=0;
        int s=0;
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
            if(s1.charAt(i)!=s2.charAt(i)){
                s++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                c++;
            }
        }
        if(c==0 && (s==0 || s==2)){
            return true;
        }
        return false;
    }
}