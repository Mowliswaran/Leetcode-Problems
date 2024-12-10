class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int p=1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            if(nums[i]==0){
                c++;
                continue;
            }
            p=p*nums[i];
        }
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[i]=p;
                continue;
            }
            arr[i]=prod/nums[i];
        }
        if(c>1){
            Arrays.fill(arr,0);
        }
        return arr;
    }
}