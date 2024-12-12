class Solution {
    public int candy(int[] ratings) {
        int arr[]=new int[ratings.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                int h=arr[i-1]+1;
                arr[i]=Math.max(h,arr[i]);
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                int h=arr[i+1]+1;
                arr[i]=Math.max(h,arr[i]);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
}