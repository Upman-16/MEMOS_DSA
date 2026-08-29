class Solution {
    public int commonFactors(int a, int b) {
        int min=Math.min(a,b);
        int count=1;
        int cf=0;
        while(count<=min){
            if(a%count==0 && b%count==0){
                cf++;
            }
            count++;
        }
        return cf;
    }
}