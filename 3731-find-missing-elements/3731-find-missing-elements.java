class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<>();
        Set<Integer> temp=new HashSet<>();
        int a=0;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            a=Math.max(a,nums[i]);
            b=Math.min(b,nums[i]);
            temp.add(nums[i]);
        }
        for(int i=b+1;i<a;i++){
            if(!temp.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}