class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
       int[] answer=new int[n];
       int totalsum=0;
       for(int i:nums){
        totalsum+=i;
       }
       int leftsum=0;
       for(int i=0;i<n;i++){
        int rightsum=totalsum-leftsum-nums[i];
        answer[i]=Math.abs(rightsum-leftsum);
        leftsum+=nums[i];
       } 
       return answer;
    }
}