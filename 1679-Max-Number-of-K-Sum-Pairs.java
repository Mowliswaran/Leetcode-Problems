class Solution {
    public int maxOperations(int[] nums, int k) {
        int i=0,c=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                c++;
                i++;
                j--;
            }
            else if((nums[i]+nums[j])>k){
                j--;
            }
            else{
                i++;
            }
        }
        return c;
    }
}