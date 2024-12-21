class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double kk=k;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double max=sum/kk;
        int i=0;
        int j=k;
        while(j<nums.length){
            sum=sum-nums[i];
            sum=sum+nums[j];
            i++;
            j++;
            double r=sum/kk;
            max=Math.max(max,r);
        }
        return max;
    }
}