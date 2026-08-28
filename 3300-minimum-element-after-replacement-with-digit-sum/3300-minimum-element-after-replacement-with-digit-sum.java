class Solution {
    public int minElement(int[] nums) {
        int a=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        nums[i]=sum;
        if(sum<a)a=sum;
       } 
       return a;
    }
}