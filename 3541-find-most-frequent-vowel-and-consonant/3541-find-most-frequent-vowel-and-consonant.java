class Solution {
    public int maxFreqSum(String s) {
       int[] freq=new int[26];
       int mv=0;
       int mc=0;
       for(char c:s.toCharArray()){
        int i=c-'a';
        freq[i]++;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            mv=Math.max(mv,freq[i]);
        }
        else{
            mc=Math.max(mc,freq[i]);
        }
       }
       return mv+mc;
    }
}