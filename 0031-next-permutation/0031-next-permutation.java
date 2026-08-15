class Solution {
    public int[] nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        //agar pivot nahi mila tou array descending order main hain
        if(pivot==-1){
            int left=0;
            int right=nums.length-1;
            while(left<right){
                swap(nums,left,right);
                left++;
                right--;}
           return nums; 
        }
        //puri pivot se aage ki array reverse 
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Reverse everything after pivot
        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
        return nums;
        
    }
     static void swap(int[] nums, int i, int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}