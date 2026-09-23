class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int td=nums[i];
            while(td>0){
                int rem=td%10;
                if(rem==digit){
                    count++;
                }
                td/=10;
            }
        }
        return count;
    }
}