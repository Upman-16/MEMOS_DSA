class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        int j=0;
        while(j<k){
            int min=nums[0];
            int p=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min=nums[i];
                    p=i;
                }
             }
                nums[p]=nums[p]*multiplier;
                j++;
        }
        return nums;    
    }
}