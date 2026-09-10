class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            sum+=nums[r];
            while(map.get(nums[r])>1){
                int x=nums[left];
                map.put(x,map.get(x)-1);
                sum-=nums[left];
                left++;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}