class Solution {
    public int findClosest(int x, int y, int z) {
       int s=Math.min(Math.abs(y-z),Math.abs(x-z));
       if(s==Math.abs(y-z) && s==Math.abs(x-z)){
        return 0;
       } else if(s==Math.abs(x-z)){
        return 1;
       }else return 2;
    }
}