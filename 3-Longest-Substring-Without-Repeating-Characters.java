class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.get(s.charAt(j))>1){
                while(map.get(s.charAt(j))>1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    
                    i++;
                }
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}