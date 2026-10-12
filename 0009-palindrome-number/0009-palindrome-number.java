class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int org=x;
        while (org!= 0) {
            int digit = org % 10;
            org= org / 10;
            rev = rev * 10 + digit;
        }
        if(x<0) return false;
        else if(x==rev)return true;
        else return false;
    }
}