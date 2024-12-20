class Solution {
    public String reverseVowels(String s) {

        int h=s.length();
        char[]s1=s.toCharArray();
        int []a=new int[h];
        int []arr=new int[h];
        int j=0;
        
        for(int i=0;i<h;i++){
            if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U'){
                a[j]=s1[i];
                j++;
            }
        }
        int k=j-1;
        for(int i=0;i<j;i++){
            arr[k]=a[i];
            k--;
        }
        int m=0;
        for(int i=0;i<h;i++){
            if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U'){
                s1[i]=(char)arr[m];
                m++;
            }
        }
        return String.valueOf(s1);


    }
}