class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max=0;
        int n=citations.length;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }
        return max;
    }
}