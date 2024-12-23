class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n1=Integer.MAX_VALUE;
        int n2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(n2<nums[i]){
                return true;
            }
            if(nums[i]<=n1){
                n1=nums[i];
            }
            else if(nums[i]<=n2){
                n2=nums[i];
            }
        }
        return false;
    }
}