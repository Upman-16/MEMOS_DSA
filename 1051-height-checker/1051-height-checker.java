class Solution {
    public int heightChecker(int[] heights) {
       int expected[]=Arrays.copyOf(heights,heights.length);
       Arrays.sort(expected);
       int count=0;
       int f=0;
       while(f<heights.length){
        if(heights[f]!=expected[f]){
            count++;
        }
        f++;
       }
      return count;  
    }
}