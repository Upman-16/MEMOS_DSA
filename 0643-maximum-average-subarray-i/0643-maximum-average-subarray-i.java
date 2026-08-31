class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-left+1==k){
                ans=Math.max(sum,ans);
                sum-=nums[left];
                left++;
            }
        }
        return (double)ans/k;
    }
}