class Solution {
    public int[] transformArray(int[] nums) {
        int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            nums[i]=0;
        }
        else nums[i]=1;
       } 
       int left=0;
       int right=nums.length-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            ans[left]=0;
            left++;
        }
        else{ans[right]=1;
        right--;}
       }
       return ans;
    }
}