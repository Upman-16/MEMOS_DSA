class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumO=n*n;
        int sumE=n*(n+1);
        return Math.abs(sumO-sumE);
    }
}