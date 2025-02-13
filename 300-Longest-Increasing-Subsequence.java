class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        int max=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(arr[j]+1>arr[i]){
                        arr[i]=arr[j]+1;
                        max=Math.max(max,arr[i]);
                    }
                }
            }
        }return max;
    }
}