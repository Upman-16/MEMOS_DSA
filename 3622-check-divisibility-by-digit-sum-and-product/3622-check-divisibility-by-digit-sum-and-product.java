class Solution {
    public boolean checkDivisibility(int n) {
        int copyn=n;
        int sum=0;
        int pro=1;
        while(copyn>0){
            int rem=copyn%10;
             sum+=rem;
             pro*=rem;
             copyn=copyn/10;
        }
        return (n%(pro+sum))==0;
    }
}