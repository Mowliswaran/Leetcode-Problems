class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        ArrayList<Character>l=new ArrayList<>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        if(k==1){
            for(int i=0;i<s.length();i++){
                if(l.contains(s.charAt(i))){
                    return 1;
                }
            }
        }
        for(int i=0;i<k;i++){
            if(l.contains(s.charAt(i)))
                c++;
        }
        int max=c;
        int i=1;
        int j=k;
        while(j<s.length()){
            if(l.contains(s.charAt(i-1))){
                c--;
            }
            if(l.contains(s.charAt(j))){
                c++;
            }
            max=Math.max(max,c);
            i++;
            j++;
        }
        return max;
    }
}