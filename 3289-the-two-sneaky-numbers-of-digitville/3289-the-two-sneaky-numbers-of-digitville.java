class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int mcs[]=new int[2];
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                mcs[c]=nums[i];
                c++;
            }
        }
        return mcs;
    }
}