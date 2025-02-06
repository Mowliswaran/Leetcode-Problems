class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int s=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int h=nums[i]*nums[j];
                if(map.containsKey(h)){
                    int l=map.get(h);
                    s+=(l*8);
                }
                map.put(h,map.getOrDefault(h,0)+1);
            }
        }
    
        return s;
    }
}