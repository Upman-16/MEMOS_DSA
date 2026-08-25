import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> present=new HashSet<>();
        for(int num:nums){
            present.add(num);
        }
        int ans=k;
        while(present.contains(ans)){
            ans+=k;
        }
        return ans;
    }
}