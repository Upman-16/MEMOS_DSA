class Solution {
    public boolean fun(int[] piles,int h,int k){
        long ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=(int)Math.ceil((double)piles[i]/k);
        }
        return ans<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=1000000000;
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(fun(piles,h,m)){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}