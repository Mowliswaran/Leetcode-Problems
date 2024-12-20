class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer>li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    l.add(new ArrayList<>(li));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                        continue;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                        continue;
                    }
                }
            }
        }
        return l;
    }
}