class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        for(int j=m;j<m+n;j++){
           
                nums1[j]=nums2[i];
                //System.out.println(nums2[i]);
                i++;
            
        }
        Arrays.sort(nums1);
    }
}