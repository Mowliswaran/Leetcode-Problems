class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int c=0,k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
            }
            else{
                c=0;
            }
            if(c<2){
            nums[k]=nums[i];
            k++;
            }
        }
        return k;
    }
}