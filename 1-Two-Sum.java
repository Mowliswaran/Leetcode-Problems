class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c=0;
        int []ar=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ar[k]=i;
                    k++;
                    ar[k]=j;
                    break;
                }
            }
        }
        return (ar);
    }
}