class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int prem[]=new int[n];
        int sufm[]=new int[n];
        prem[0]=nums[0];
        for(int i=1;i<n;i++){
            prem[i]=Math.max(prem[i-1],nums[i]);
        }
        sufm[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufm[i]=Math.min(sufm[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if((prem[i]-sufm[i])<=k){
                return i;
            }
        }
        return -1;
    }
}